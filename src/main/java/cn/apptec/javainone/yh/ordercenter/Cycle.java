package cn.apptec.javainone.yh.ordercenter;

/**
 * 生成 mini 店自动补货的sql 语句
 */
public class Cycle {

    private static final String AUTO_COMMIT_TEMPLATE = "UPDATE parameter_product_space set updated_time = date_add(updated_time, INTERVAL 1 SECOND) WHERE updated_time > %s and updated_time < %s;";



    public static void main(String[] args) throws Exception {


    }

}
