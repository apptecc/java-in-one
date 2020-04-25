package cn.apptec.javainone.factory.simple;

import java.util.regex.Pattern;

/**
 * @author liuyangsheng
 * @date 2020/2/2
 * @Description:
 * @Modified By:
 */
public class YellowHuman implements Human {
    @Override
    public String sayHello() {
        return this.getClass().getSimpleName() + " says hello";
    }

    @Override

    public String getColor() {

        //@formatter:off
        Pattern.compile("123[a-zA-Z]+");
        String s = "HelloWorldAdd";
        String red = "RED";




        return ColorEnum.YELLOW.getDesc();
        //@formatter:on
    }

    //   afa
}
