package cn.apptec.javainone;

import com.google.common.base.CaseFormat;
import com.google.common.base.Converter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class BeanUtils {
    private static Map<Class, SerializedLambda> CLASS_LAMDBA_CACHE = new ConcurrentHashMap<>();
    private static Converter<String, String> converter = CaseFormat.LOWER_CAMEL.converterTo(CaseFormat.LOWER_UNDERSCORE);


    /***
     * 转换方法引用为属性名
     * @param fn
     * @return
     */
    public static <T> String convertToFieldName(IGetter<T> fn) {
        SerializedLambda lambda = getSerializedLambda(fn);
        String methodName = lambda.getImplMethodName();
        String prefix = "";
        if (methodName.startsWith("get")) {
            prefix = "get";
        } else if (methodName.startsWith("is")) {
            prefix = "is";
        }
        return converter.convert(methodName.substring(prefix.length()));
    }


    public static SerializedLambda getSerializedLambda(Serializable fn) {
        SerializedLambda lambda = CLASS_LAMDBA_CACHE.get(fn.getClass());
        if (lambda == null) {
            try {
                Method method = fn.getClass().getDeclaredMethod("writeReplace");
                method.setAccessible(Boolean.TRUE);
                lambda = (SerializedLambda) method.invoke(fn);
                CLASS_LAMDBA_CACHE.put(fn.getClass(), lambda);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return lambda;
    }

    public static void main(String[] args) {
        String getName = BeanUtils.convertToFieldName(Person::HelloWorld);
        System.out.println(getName);
    }
}
