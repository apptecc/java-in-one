package cn.apptec.javainone.design.factory;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public abstract class AbstractCarFactory {

    /**
     * build car
     * @param tyreCount
     * @return
     */
    public abstract Car buildCar(Integer tyreCount);
}
