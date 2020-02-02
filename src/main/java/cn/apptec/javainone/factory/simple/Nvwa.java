package cn.apptec.javainone.factory.simple;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class Nvwa {

    public static void main(String[] args) {
        // default human say hello
        AbstractHumanFactory factory = new SimpleHumanFactory();
        System.out.println(factory.createHuman().sayHello());

        //
        System.out.println(factory.createHuman(ColorEnum.BLACK).sayHello());

    }
}
