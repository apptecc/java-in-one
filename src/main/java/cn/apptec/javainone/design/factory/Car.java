package cn.apptec.javainone.design.factory;

import lombok.Data;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public interface Car {
    /**
     * brand name
     * @return
     */
    String getBrand();

    /**
     * tyre count
     * @return
     */
    Integer getTyreCount();
}
