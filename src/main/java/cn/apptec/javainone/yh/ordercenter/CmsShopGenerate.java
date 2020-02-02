package cn.apptec.javainone.yh.ordercenter;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 生成 mini 店自动补货的sql 语句
 */
public class CmsShopGenerate {
    private static String shopCodes = "9191 ,9112 ,9467 ,9266 ,90B8,9168 ,9097 ,9866 ,9308 ,9239 ,9369 ,9501 ,9461 ,9286 ,9091 ,9690 ,9708 ,9100 ,9655 ,9689 ,9177 ,9121 ,9219 ,9247 ,9162 ,9550 ,9148 ,9085 ,9119 ,9137 ,9299 ,9087 ,9260 ,9208 ,9532 ,9575 ,9099 ,9279 ,90D4,9106 ,9861";

    private static final String TEMPLATE = "replace INTO yh_sod_cmscenter_shopcode (shop_code, created_by, update_by) VALUES ('%s', 'sys2', 'sys');";


    public static void main(String[] args) throws Exception {


        List<String> shopCodeList = Splitter.on(",").splitToList(shopCodes);
        for (String shopCode : shopCodeList) {
            System.out.println(String.format(TEMPLATE, StringUtils.trim(shopCode)));
        }
    }

}
