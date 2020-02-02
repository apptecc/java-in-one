package cn.apptec.javainone.design.factory;

/**
 * @author liuyangsheng
 * @date 2020/2/2
 * @Description:
 * @Modified By:
 */
public class BenzCarFactory extends AbstractCarFactory {

    @Override
    public Car buildCar(Integer tyreCount) {
        switch (tyreCount) {
            case 2:
                return new BenzBicycle("Benz Bicycle", 2);
            case 4:
                return new BenzGlk();
            default:
                throw new RuntimeException("illegal tyre count");
        }
    }
}
