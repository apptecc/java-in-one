package cn.apptec.javainone.design.singlton.multiinstance;

import java.util.stream.IntStream;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description: 多boss大臣测试
 * @Modified By:
 */
public class MultiEmperorMinister {
    public static void main(String[] args) {
        IntStream.range(0, 100).forEach(
                p -> {
                    String say = MultiEmperor.say("word" + p);
                    System.out.println(say);
                }
        );
    }

}
