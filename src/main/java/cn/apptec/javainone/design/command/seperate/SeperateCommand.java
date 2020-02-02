package cn.apptec.javainone.design.command.seperate;

import cn.apptec.javainone.design.command.Group;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public abstract class SeperateCommand {

    protected Group group;

    public SeperateCommand(Group group) {
        this.group = group;
    }

    abstract void execute();
}
