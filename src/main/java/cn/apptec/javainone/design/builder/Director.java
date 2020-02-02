package cn.apptec.javainone.design.builder;

import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class Director {

    private BenzBuilder benzBuilder = new BenzBuilder();
    private BydBuilder bydBuilder = new BydBuilder();

    public BenzCarModel getBenzCarModel() {
        ArrayList<String> sequence = Lists.newArrayList("start", "start", "stop", "fire", "engineBoom", "alarm");
        BenzCarModel carModel = new BenzCarModel();
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setBenzCarModel(carModel);
        benzBuilder.setSequence(sequence);
        return carModel;
    }

    public BydCarModel getBydCarModel() {
        ArrayList<String> sequence = Lists.newArrayList("alarm", "start", "stop", "fire", "engineBoom", "alarm");
        BydCarModel bydCarModel = new BydCarModel();
        BydBuilder bydBuilder = new BydBuilder();
        bydBuilder.setBydCarModel(bydCarModel);
        bydBuilder.setSequence(sequence);
        return bydCarModel;
    }


}
