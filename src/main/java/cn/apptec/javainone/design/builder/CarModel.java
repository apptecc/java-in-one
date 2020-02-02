package cn.apptec.javainone.design.builder;

import com.google.common.collect.Lists;
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
public abstract class CarModel {
    @Getter
    @Setter
    private List<String> sequence = Lists.newArrayList();

    abstract void start();
    abstract void stop();
    abstract void alarm();
    abstract void engineBoom();
    public final void run() {
        for (String currentSeq : sequence) {
            switch (currentSeq) {
                case "start":
                    start();
                    break;
                case "stop":
                    stop();
                    break;
                case "alarm":
                    alarm();
                    break;
                case "engineBoom":
                    engineBoom();
                    break;
                default:
                    break;
            }
        }
    };
}
