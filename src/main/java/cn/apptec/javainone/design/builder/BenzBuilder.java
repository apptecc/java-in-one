package cn.apptec.javainone.design.builder;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
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
public class BenzBuilder {
    @Getter
    @Setter
    private BenzCarModel benzCarModel;

    public BenzBuilder() {
    }

    public void setSequence(List<String> list) {
        benzCarModel.setSequence(list.stream().collect(Collectors.toList()));
    }
}
