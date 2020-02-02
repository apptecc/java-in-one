package cn.apptec.javainone.design.command.seperate;

import cn.apptec.javainone.design.command.CodeGroup;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class RudeCommand2 extends SeperateCommand {


    public RudeCommand2() {
        super(new CodeGroup());
    }

    @Override
    void execute() {
        super.group.delete();
    }
}
