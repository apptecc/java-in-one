package cn.apptec.javainone.sod.productcenter.controller;

import com.google.common.base.Joiner;
import lombok.Data;

@Data
public class ShopProduct {
    private String locationCode;
    private String productCode;
    private String logisticMode;
    private String validTag;
    private String status;
    private String bizType;

    @Override
    public String toString() {
        return Joiner.on("\t").join(locationCode, productCode, logisticMode, validTag, status, bizType);
    }

    // 门店	商品	物流模式	有效标识	商品状态	经营方式	门店	商品	物流模式	有效标识	商品状态	经营方式	云创不存在	物流不一致	有效标识不一致	状态不一致	经营方式不一致	云超不存在
}
