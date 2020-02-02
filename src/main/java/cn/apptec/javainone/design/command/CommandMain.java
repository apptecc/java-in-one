package cn.apptec.javainone.design.command;

/**
 * Created by liuyangsheng on 2020/2/2.
 *
 * @Description:
 * @Modified By:
 */
public class CommandMain {
    public static void main(String[] args) {
        Invoker me = new Invoker();
        me.setCommand(new AddRequirementCommand());
        me.action();
    }
}
