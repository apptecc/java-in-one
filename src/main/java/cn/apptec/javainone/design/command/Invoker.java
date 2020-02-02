package cn.apptec.javainone.design.command;

import lombok.Setter;

/**
 * Created by liuyangsheng on 2020/2/2.
 *
 * @Description:
 * @Modified By:
 */
public class Invoker {
    @Setter
    private Command command;

    public void action() {
        this.command.execute();
    }
}
