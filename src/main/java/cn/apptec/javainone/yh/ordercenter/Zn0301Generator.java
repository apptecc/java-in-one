package cn.apptec.javainone.yh.ordercenter;

import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.List;

/**
 * 生成 mini 店自动补货的sql 语句
 */
public class Zn0301Generator {


    private static final String productCodes="1003919,100935,1043070,1043349,1063096,1124802,1124803,205907,251482,251486,257384,257385,257391,257403,258576,258581,267082,267083,267084,267094,267097,275542,277803,284559,321203,345425,345426,345453,381618,403725,403727,403728,424134,436077,448373,448374,448375,463347,471151,48310,51610,569362,572404,57352,64498,648125,651045,651046,661551,664803,674041,678325,678490,712086,736752,736753,765617,765620,790368,790506,793225,812854,81329,8251,832550,852957,87774,882257,882259,892709,94353,97449,978581,989485,989487,989490";
    private static final String bigCategoryCodes="1254";
    private static final List<String> purchaseOrgCodes = Arrays.asList("P003", "P009");

    private static final String TEMPLATE = "INSERT INTO b2b_ordercenter_prod.shop_order_type_conf (order_type, purchase_org, purchase_org_name, prefer_dc_code, big_category_code, big_category_name, small_category_code, small_category_name, product_code, product_barcode, product_name, debar_flag, pr_addition_type, status, created_by, updated_by, piece_flag, root_category_code, root_category_name, mid_category_code, mid_category_name, shop_type, shop_type_name) VALUES ('ZN0301', '%s', '', 'W029', '%s', '', '', '', '%s', '', '', 0, '02', 1, 'sys', 'sys', 1, '', '', '', '', '', '');\n";


    public static void main(String[] args) throws Exception {
        List<String> productCodeList = Splitter.on(",").omitEmptyStrings().trimResults().splitToList(productCodes);

        for (String productCode : productCodeList) {
            for (String purchaseOrgCode : purchaseOrgCodes) {
                System.out.println(String.format(TEMPLATE, purchaseOrgCode, bigCategoryCodes, productCode));
            }
        }
    }
}
