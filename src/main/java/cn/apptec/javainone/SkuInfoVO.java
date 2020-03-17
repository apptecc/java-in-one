package cn.apptec.javainone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.common.collect.Lists;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author xuhui
 * @date 2019/6/20 21:43
 * @Description
 */
@Data
public class SkuInfoVO implements Serializable {
    private static final long serialVersionUID = 716480166643034880L;
    /**
     * 渠道编码
     */
    private String channelCode;
    /**
     * 业态信息
     */
    private String storeTypeCode;
    /**
     * 门店编码
     */
    private String storeCode;
    /**
     * 商品编码
     */
    private String productCode;

    private Integer isHighValue;

    public Boolean getIsHighValue() {
        return Objects.equals(isHighValue, 1);
    }

    public static void main(String[] args) {
        SkuInfoVO vo = new SkuInfoVO();
        vo.setIsHighValue(1);
        System.out.println(JSON.toJSONString(vo));



        // SkuInfoVO vo = new SkuInfoVO();
        // vo.setChannelCode("19");
        // vo.setStoreTypeCode("001");
        // vo.setStoreCode("9479");
        // vo.setProductCode("839420");
        // List<SkuInfoVO> list = Lists.newArrayList(vo);
        // System.out.println(JSON.toJSONString(list));

    }
}
