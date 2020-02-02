package cn.apptec.javainone.design.command.seperate;

import cn.apptec.javainone.design.command.CodeGroup;
import cn.apptec.javainone.design.command.Command;
import cn.apptec.javainone.design.command.Group;

/**
 * Created by liuyangsheng on 2020/2/2.
 *
 * @Description:
 * @Modified By:
 */
public class RudeCommand extends SeperateCommand {


    public RudeCommand() {
        super(new CodeGroup());
    }

    @Override
    void execute() {
        super.group.add();
    }
}
