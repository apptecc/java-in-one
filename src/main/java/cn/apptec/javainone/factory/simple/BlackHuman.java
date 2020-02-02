package cn.apptec.javainone.factory.simple;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class BlackHuman implements Human {
    @Override
    public String sayHello() {
        return this.getClass().getSimpleName() + " says hello";
    }

    @Override
    public String getColor() {
        return ColorEnum.BLACK.getDesc();
    }
}
