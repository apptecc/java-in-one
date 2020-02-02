package cn.apptec.javainone.design.factory;

import lombok.Data;
import lombok.ToString;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
@Data
@ToString(of = {"brand", "tyreCount"})
public class BenzGlk implements Car {

    @Override
    public String getBrand() {
        return "BENZ GLK";
    }

    @Override
    public Integer getTyreCount() {
        return 4;
    }
}
