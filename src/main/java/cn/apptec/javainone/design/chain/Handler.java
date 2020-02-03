package cn.apptec.javainone.design.chain;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/3
 *
 * @Description:
 * @Modified By:
 */
public abstract class Handler {

    private Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler() {
    }

    void tryHandle(IWoman iWoman) {
        if (canHandle(iWoman)) {
            handle(iWoman);
        }
        if (null != nextHandler) {
            nextHandler.tryHandle(iWoman);
        }
    }

    abstract void handle(IWoman iWoman);

    abstract boolean canHandle(IWoman iWoman);
}
