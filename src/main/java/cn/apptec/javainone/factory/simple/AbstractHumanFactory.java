package cn.apptec.javainone.factory.simple;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public abstract class AbstractHumanFactory {

    /**
     * xx
     * @return xx
     */
    public Human createHuman() {
        return createHuman(ColorEnum.YELLOW);
    }

    /**
     * xx
     * @param color xx
     * @return xx
     */
    public abstract Human createHuman(ColorEnum color);
}
