package cn.apptec.javainone.design.chain;

/**
 * Created by liuyangsheng on 2020/2/3.
 *
 * @Description:
 * @Modified By:
 */
public interface IWoman {

    /**
     * 0: 未出嫁 1: 出嫁 2: 寡妇
     * @return
     */
    int getType();

    boolean canGoOut();

    String getName();

    boolean getHandleStatus();

    void setHandleStatus(Boolean flag);
}
