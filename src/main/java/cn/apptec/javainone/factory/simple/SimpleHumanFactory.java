package cn.apptec.javainone.factory.simple;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class SimpleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman(ColorEnum color) {
        switch (color) {
            case BLACK:
                return new BlackHuman();
            case YELLOW:
                return new YellowHuman();
            case WHITE:
                return new WhiteHuman();
            default:
                throw new IllegalStateException("Unexpected value: " + color);
        }
    }
}
