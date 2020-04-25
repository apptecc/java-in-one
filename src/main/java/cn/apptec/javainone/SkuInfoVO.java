package cn.apptec.javainone;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.*;
import java.lang.invoke.SerializedLambda;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author xuhui
 * @date 2019/6/20 21:43
 * @Description
 */
@Data
public class SkuInfoVO implements Serializable {
    private static final long serialVersionUID = 716480166643034880L;
    /**
     * 渠道编码
     */
    private String channelCode;


    /**
     * 门店编码
     */
    private String storeCode;
    /**
     * 商品编码
     */
    private String productCode;
    private Integer isHighValue;
    private Integer aHello;
    /**
     * 业态信息
     */
    private String storeTypeCode;

    public static void main(String[] args) {

        SkuInfoVO vo = new SkuInfoVO();


        vo.setChannelCode("20");
        Function<String, String> f = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s;
            }
        };


        SerializedLambda resolve = resolve(f);
        System.out.println(resolve.getImplMethodName());

    }

    public Boolean getIsHighValue() {
        return Objects.equals(isHighValue, 1);
    }

    /**
     * 通过反序列化转换 lambda 表达式，该方法只能序列化 lambda 表达式，不能序列化接口实现或者正常非 lambda 写法的对象
     *
     * @param lambda lambda对象
     * @return 返回解析后的 SerializedLambda
     */
    public static SerializedLambda resolve(Function lambda) {
        if (!lambda.getClass().isSynthetic()) {
        }
        try (ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(serialize(lambda))) {
            @Override
            protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
                Class<?> clazz = super.resolveClass(objectStreamClass);
                return clazz == java.lang.invoke.SerializedLambda.class ? SerializedLambda.class : clazz;
            }
        }) {
            return (SerializedLambda) objIn.readObject();
        } catch (ClassNotFoundException | IOException e) {
            // noting we can do
            throw new RuntimeException("nothing we can do");
        }
    }

    public static byte[] serialize(Object object) {
        if (object == null) {
            return null;
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            oos.flush();
        } catch (IOException ex) {
            throw new IllegalArgumentException("Failed to serialize object of type: " + object.getClass(), ex);
        }
        return baos.toByteArray();
    }

    private String getColumn(SerializedLambda lambda, boolean onlyColumn) {
        String fieldName = resolveFieldName(lambda.getImplMethodName());

        System.out.println(fieldName);
        // return Optional.ofNullable(columnMap.get(fieldName.toUpperCase(Locale.ENGLISH)))
        //         .map(onlyColumn ? ColumnCache::getColumn : ColumnCache::getColumnSelect)
        //         .orElseThrow(() -> ExceptionUtils.mpe("your property named \"%s\" cannot find the corresponding database column name!", fieldName));
        return "";
    }

    public static String resolveFieldName(String getMethodName) {
        if (getMethodName.startsWith("get")) {
            getMethodName = getMethodName.substring(3);
        } else if (getMethodName.startsWith("is")) {
            getMethodName = getMethodName.substring(2);
        }
        // 小写第一个字母
        return firstToLowerCase(getMethodName);
    }

    public static String firstToLowerCase(String param) {
        return param.substring(0, 1).toLowerCase() + param.substring(1);
    }

}
