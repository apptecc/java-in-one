package cn.apptec.javainone.design.command;

/**
 * Created by liuyangsheng on 2020/2/2.
 *
 * @Description:
 * @Modified By:
 */
public abstract class Command {
    protected CodeGroup codeGroup = new CodeGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected RequirementGroup requirementGroup = new RequirementGroup();

    public abstract void execute();
}
