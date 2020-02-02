package cn.apptec.javainone.design.builder;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class BydBuilder {
    @Getter
    @Setter
    private BydCarModel bydCarModel;

    public BydBuilder() {
    }

    public void setSequence(List<String> list) {
        bydCarModel.setSequence(list.stream().collect(Collectors.toList()));
    }
}
