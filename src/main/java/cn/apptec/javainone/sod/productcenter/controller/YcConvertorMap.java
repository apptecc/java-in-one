package cn.apptec.javainone.sod.productcenter.controller;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author wangshuai
 * @create 2019-06-17
 */
public class YcConvertorMap {
    /**
     * 中台物流模式对应云创数据
     */
    public final static BiMap<String, String> logisticsModeCodeMap = HashBiMap.create(new ImmutableMap.Builder<String, String>()
            //直送
            .put("1", "1")
            //直通
            .put("2", "4")
            //配送
            .put("3", "2")
            .build());
    /**
     * 中台商品状态对应云创数据
     */
    public final static BiMap<String, String> productStatusMap = HashBiMap.create(new ImmutableMap.Builder<String, String>()
            //B正常商品
            .put("0", "1")
            //A新品
            .put("2", "2")
            //H停售
            .put("3", "3")
            //L退场
            .put("6", "5")
            //K永久停购
            .put("7", "6")
            //E暂时停购
            .put("9", "8")
            .build());
    /**
     * 中台经营方式对应云创数据
     */
    public final static BiMap<String, String> bizTypeMap = HashBiMap.create(new ImmutableMap.Builder<String, String>()
            //自营
            .put("0", "1")
            //联营
            .put("1", "2")
            .build());

    /**
     * 中台有效标识
     */
    public final static BiMap<String, String> validTagMap = HashBiMap.create(new ImmutableMap.Builder<String, String>()
            //不可退货
            .put("0", "3") //无效
            //可退款退货
            .put("2", "2") //有效不可订
            .put("1", "1") //有效
            .build());
}
