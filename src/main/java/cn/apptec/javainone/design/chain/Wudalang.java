package cn.apptec.javainone.design.chain;

/**
 * Created by liuyangsheng on 2020/2/3.
 *
 * @Description:
 * @Modified By:
 */
public class Wudalang extends Handler {

    @Override
    public void handle(IWoman iWoman) {
        System.out.println("武大郎允许" + iWoman.getName() + "出门");
    }

    @Override
    boolean canHandle(IWoman iWoman) {
        if (iWoman.getHandleStatus()) {
            System.out.println("已经处理过了, 不再处理");
            return false;
        }
        return true;
    }
}
