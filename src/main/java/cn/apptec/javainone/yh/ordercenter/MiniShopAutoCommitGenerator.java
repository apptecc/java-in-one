package cn.apptec.javainone.yh.ordercenter;

import com.google.common.base.Splitter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 生成 mini 店自动补货的sql 语句
 */
public class MiniShopAutoCommitGenerator {

    private static final String AUTO_CALC_SHOP_CODES = "9PR9,9P93,9NX8,9PP4,9PR3,9M14,9M13,9M39,9M1M,9M63,9M67,9M1C,9M1B,9M15,9M51,9M16,9M1D,9M62,9M1L,9M78,9M64,9M77,9M2O,9M57,9M2P,9M44,9M19,9M55,9MA0";
    private static final String AUTO_COMMIT_SHOP_CODES = "9PR9,9P93,9NX8,9PP4,9PR3,9M14,9M13,9M39,9M1M,9M63,9M67,9M1C,9M1B,9M15,9M51,9M16,9M1D,9M62,9M1L,9M78,9M64,9M77,9M2O,9M57,9M2P,9M44,9M19,9M55,9MA0";

    private static final String AUTO_COMMIT_TEMPLATE = "INSERT INTO shop_order_type_conf (order_type, purchase_org, purchase_org_name, prefer_dc_code, big_category_code, big_category_name, small_category_code, small_category_name, product_code, product_barcode, product_name, debar_flag, pr_addition_type, status, created_by, updated_by, piece_flag, root_category_code, root_category_name, mid_category_code, mid_category_name, shop_type, shop_type_name) VALUES ('AUTO_COMMIT', '', '', '%s', '8', '', '', '', '', '', '', 0, '', 1, 'sys', 'sys', 1, '', '', '', '', '', '');\n";
    private static final String AUTO_CALC_TEMPLATE = "INSERT INTO shop_order_type_conf_calc (order_type, purchase_org, purchase_org_name, prefer_dc_code, big_category_code, big_category_name, small_category_code, small_category_name, product_code, product_barcode, product_name, debar_flag, pr_addition_type, status, created_by, updated_by, piece_flag, root_category_code, root_category_name, mid_category_code, mid_category_name, shop_type, shop_type_name) VALUES ('AUTO_COMMIT', '', '', '%s', '8', '', '', '', '', '', '', 0, '', 1, 'sys', 'sys', 1, '', '', '', '', '', '');\n";


    public static void main(String[] args) throws Exception {
        List<String> autoCalcList = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(AUTO_CALC_SHOP_CODES);
        List<String> autoCommitList = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(AUTO_COMMIT_SHOP_CODES);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String today = sdf.format(new Date());
        String fileName = "miniShopAutoCommit" + today + ".txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/lys/Desktop/yh-document/routin/" + fileName)));

        for (String s : autoCalcList) {
            bw.write(String.format(AUTO_CALC_TEMPLATE, s));
        }

        bw.newLine();

        for (String s : autoCommitList) {
            bw.write(String.format(AUTO_COMMIT_TEMPLATE, s));
        }

        bw.flush();
        bw.close();
    }

}

// AUTO_COMMIT_EB
