package cn.apptec.javainone.design.command.seperate;

import com.google.common.collect.Lists;

/**
 * Created by liuyangsheng on 2020/2/2.
 *
 * @Description:
 * @Modified By:
 */
public class SeperateMain {
    public static void main(String[] args) {

        SeparateInvoker seperateInvoker = new SeparateInvoker();
        seperateInvoker.setSeparateCommands(Lists.newArrayList(new RudeCommand(), new RudeCommand2()));
        seperateInvoker.execute();

    }
}
