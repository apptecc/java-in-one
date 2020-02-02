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
@ToString
public class BenzBicycle implements Car {
    private String brand;
    private Integer tyreCount;

    public BenzBicycle(String brand, Integer tyreCount) {
        this.brand = brand;
        this.tyreCount = tyreCount;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public Integer getTyreCount() {
        return this.tyreCount;
    }
}
