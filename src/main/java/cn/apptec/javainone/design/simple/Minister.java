package cn.apptec.javainone.design.simple;

import java.util.stream.IntStream;

import static cn.apptec.javainone.design.simple.Emperor.*;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description: 大臣类
 * @Modified By:
 */
public class Minister {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10).forEach(
                p -> {
                    String say = getInstance().say(String.valueOf(p));
                    System.out.println(say);
                }
        );
    }
}
