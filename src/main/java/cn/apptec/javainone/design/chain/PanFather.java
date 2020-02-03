package cn.apptec.javainone.design.chain;

/**
 * Created by liuyangsheng on 2020/2/3.
 *
 * @Description:
 * @Modified By:
 */
public class PanFather extends Handler {

    public PanFather(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(IWoman iWoman) {
        System.out.println("潘父允许" + iWoman.getName() + "出门");
        iWoman.setHandleStatus(Boolean.TRUE);
    }

    @Override
    boolean canHandle(IWoman iWoman) {
        return true;
    }
}
