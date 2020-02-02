package cn.apptec.javainone.design.singlton.multiinstance;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * @author liuyangsheng
 * @date 2020/2/2
 * @Description: 多实例皇帝
 * @Modified By:
 */
public class MultiEmperor {


    private static final Integer MAX_INSTANCE_NUM = 4;

    private static List<MultiEmperor> instances = Lists.newArrayListWithCapacity(MAX_INSTANCE_NUM);
    private static List<String> nameList = Lists.newArrayListWithCapacity(MAX_INSTANCE_NUM);
    private Integer index;


    static {
        for (int i = 0; i < MAX_INSTANCE_NUM; i++) {
            instances.add(new MultiEmperor(i));
            nameList.add("emperor" + i);
        }
    }

    private MultiEmperor(Integer index) {
        this.index = index;
    }


    public static MultiEmperor getInstance() {
        int index = new Random().nextInt(4);
        return instances.get(index);
    }

    public static String say(String hello) {
       return hello + ":" + nameList.get(new Random().nextInt(4));
    }
}
