package cn.apptec.javainone.yh.ordercenter;// package cn.nxnil.yonghui.center.cn.apptec.javainone.ordercenter;
//
// import com.alibaba.fastjson.JSON;
// import com.google.common.base.Splitter;
// // import org.redisson.Redisson;
// // import org.redisson.api.RBucket;
// // import org.redisson.api.RSet;
// // import org.redisson.api.RedissonClient;
// // import org.redisson.client.codec.Codec;
// // import org.redisson.client.codec.StringCodec;
// // import org.redisson.config.Config;
//
// import java.io.BufferedWriter;
// import java.io.File;
// import java.io.FileWriter;
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.Iterator;
// import java.util.List;
// import java.util.stream.IntStream;
//
// /**
//  * 生成 mini 店自动补货的sql 语句
//  */
// public class MyTest {
//
//
//     private static final String AUTO_COMMIT_TEMPLATE = "INSERT INTO sod_basic_center.base_store_info (channel_store_name, name, code, store_type, store_type_name, province_code, province_name, city_code, city_name, county_code, county_name, addr_detail, contact, telephone, standby_phone, service_time_start, service_time_stop, open_state, coordinate_type, latitude, longitude, range_type, range_radius, range_points, delivery_type, delivery_time_limit, picking_mode, created_time, created_by, updated_time, updated_by, is_delete) VALUES ('永辉超市-福州屏西店%s', '福州屏西店%s', '900%s', '001', 'Bravo', '001', '福建省', 'xx', 'xx', 'xx', 'xx', '六一北路9999号', '康师傅', '13022222222', '13011111111,13022222222,13022222228', '10:00:00', '20:00:00', 0, 4, 26.087294, 119.325000, 2, 0, '[{\"lat\":31.23456,\"lng\":121.445886},{\"lat\":31.236351,\"lng\":121.465828},{\"lat\":31.223568,\"lng\":121.465541},{\"lat\":31.218441,\"lng\":121.441502}]', '[\"1\"]', 2, 3, '2019-05-22 16:31:34', 'sys', '2019-06-16 16:16:31', '18100620962', 0);\n";
//     private static final String AUTO_CALC_TEMPLATE = "INSERT INTO shop_order_type_conf_calc (order_type, purchase_org, purchase_org_name, prefer_dc_code, big_category_code, big_category_name, small_category_code, small_category_name, product_code, product_barcode, product_name, debar_flag, pr_addition_type, status, created_by, updated_by, piece_flag, root_category_code, root_category_name, mid_category_code, mid_category_name, shop_type, shop_type_name) VALUES ('AUTO_COMMIT', '', '', '%s', '', '', '', '', '', '', '', 0, '', 1, 'sys', 'sys', 1, '', '', '', '', '', '');\n";
//
//
//     public static void main(String[] args) throws Exception {
//         // IntStream.rangeClosed(0, 9).boxed().forEach(p -> {
//         //     System.out.println(String.format(AUTO_COMMIT_TEMPLATE, p, p, p));
//         // });
//
//         Config config = new Config();
//         // config.useClusterServers()
//         //         .setScanInterval(2000)
//         //         .addNodeAddress("redis://10.251.64.35:7001" )
//         //         .addNodeAddress("redis://10.251.64.35:7004")
//         //         .addNodeAddress("redis://10.251.64.77:7002")
//         //         .addNodeAddress("redis://10.251.64.77:7005")
//         //         .addNodeAddress("redis://10.251.64.16:7003")
//         //         .addNodeAddress("redis://10.251.64.16:7006")
//         // .setPassword("mypassword")
//         // ;
//
//         config.useClusterServers()
//                 .setScanInterval(2000)
//                 .addNodeAddress("redis://10.254.27.20:7001" )
//                 .addNodeAddress("redis://10.254.27.43:7002")
//                 .addNodeAddress("redis://10.254.27.34:7003")
//                 .addNodeAddress("redis://10.254.27.35:7004")
//                 .addNodeAddress("redis://10.254.27.31:7005")
//                 .addNodeAddress("redis://10.254.27.42:7006")
//         .setPassword("redispasswd123yhcq");
//
//
//         // config.useClusterServers()
//         //         .setScanInterval(2000)
//         //         .addNodeAddress("redis://10.0.71.50:7001" )
//         //         .addNodeAddress("redis://10.0.71.50:7006")
//         //         .addNodeAddress("redis://10.0.71.51:7004")
//         //         .addNodeAddress("redis://10.0.71.51:7002")
//         //         .addNodeAddress("redis://10.0.71.52:7003")
//         //         .addNodeAddress("redis://10.0.71.52:7005")
//         // .setPassword("miniredispasswd123")
//         ;
//         RedissonClient redisson = Redisson.create(config);
//
//         Iterator<Object> testset =
//                 redisson.getSet("testset", StringCodec.INSTANCE).iterator();
//         testset.forEachRemaining(p -> {
//             System.out.println(p);
//         });
//         redisson.shutdown();
//     }
//
// }
//
//
//
//
//
