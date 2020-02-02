package cn.apptec.javainone.design.command.seperate;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class SeparateInvoker {

    @Getter
    @Setter
    private List<SeperateCommand> separateCommands;

    public void execute() {
        System.out.println("prepare...");
        for (SeperateCommand seperateCommand : separateCommands) {
            seperateCommand.execute();
        }
        System.out.println("done...");
    }
}
