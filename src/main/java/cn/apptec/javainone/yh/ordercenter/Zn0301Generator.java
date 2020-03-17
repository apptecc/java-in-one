package cn.apptec.javainone.yh.ordercenter;

import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.List;

/**
 * 生成 mini 店自动补货的sql 语句
 */
public class Zn0301Generator {


    private static final String productCodes="275542,424133,448373,448374,448375,648125,661551,678325,793225,81329,8307,94353,470896,838168,253436,253437,253438,253440,253442,253445,253446,253447,253448,377456,448339,480276,557468,838248,100935,1063095,1063096,205907,251482,251486,257384,257385,436077,57352,8250,8251,8252,994142,394162,732719,838172,838177,267094,1043349,1124802,258581,381618,403725,651045,674041,678490,765617,765620,978581,989490,267097,1060655,1060656,1060657,1060658,1060659,1060660,1061472,1061684,570324,570325,570334,991620,991623,251496,345453,237499,853656,930001,659306,771099,713910,659308,1019514,1020260,1063624,1087484,1116105,1116106,1123207,14433,16442,261833,261837,261838,261846,261847,261913,261914,289912,446032,520044,532231,584944,712089,712090,801668,840861,859903,930911,952272,1191579,1191580,1191581,277803";
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
