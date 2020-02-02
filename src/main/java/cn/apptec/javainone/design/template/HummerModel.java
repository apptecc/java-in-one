package cn.apptec.javainone.design.template;

/**
 * @author liuyangsheng
 * @date 2020/2/2
 * @Description:
 * @Modified By:
 */
public abstract class HummerModel {
    /**
     * xx
     *
     * @return
     */
    public abstract String start();

    /**
     * xx
     *
     * @return
     */
    public abstract String stop();

    /**
     * xx
     *
     * @return xx
     */
    public abstract String alarm();

    /**
     * xx
     *
     * @return xx
     */
    public abstract String engineBoom();

    /**
     * xx
     */
    public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    /**
     *
     * @return
     */
    public Boolean isAlarm() {
        return Boolean.TRUE;
    }

}
