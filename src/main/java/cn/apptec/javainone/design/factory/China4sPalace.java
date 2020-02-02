package cn.apptec.javainone.design.factory;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class China4sPalace {

    public static void main(String[] args) {
        AbstractCarFactory factory = new BenzCarFactory();
        Car car = factory.buildCar(2);
        Car car2 = factory.buildCar(4);
        System.out.println(car);
        System.out.println(car2);

    }
}
