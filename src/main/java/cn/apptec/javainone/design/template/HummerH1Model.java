package cn.apptec.javainone.design.template;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class HummerH1Model extends HummerModel {


    @Override
    public String start() {
        System.out.println("start...");
        return null;
    }

    @Override
    public String stop() {
        System.out.println("stop...");
        return null;
    }

    @Override
    public String alarm() {
        System.out.println("alarm...");
        return null;
    }

    @Override
    public String engineBoom() {
        System.out.println("boom...");
        return null;
    }

    @Override
    public Boolean isAlarm() {
        return Boolean.FALSE;
    }
}
