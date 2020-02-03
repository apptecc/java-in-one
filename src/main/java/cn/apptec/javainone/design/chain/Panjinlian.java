package cn.apptec.javainone.design.chain;

import lombok.Setter;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/3
 *
 * @Description:
 * @Modified By:
 */
public class Panjinlian implements IWoman {
    private boolean handleStatus;

    @Override
    public int getType() {
        return 1;
    }

    @Override
    public boolean canGoOut() {
        return true;
    }

    @Override
    public String getName() {
        return "潘金莲";
    }

    @Override
    public boolean getHandleStatus() {
        return handleStatus;
    }

    @Override
    public void setHandleStatus(Boolean flag) {
        this.handleStatus = flag;
    }


}
