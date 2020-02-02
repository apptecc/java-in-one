package cn.apptec.javainone.yh.ordercenter;// package cn.nxnil.yonghui.center.cn.apptec.javainone.ordercenter;
//
// import com.google.common.base.Splitter;
//
// import java.io.BufferedWriter;
// import java.io.File;
// import java.io.FileWriter;
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.List;
//
// /**
//  * 生成 mini 店自动补货的sql 语句
//  */
// public class EsTest {
//
//
//
//     public static void main(String[] args) throws Exception {
//
//     }
//
//     public void initElasticSearchClient() {
//         Settings settings = Settings.builder().put("cluster.name", this.esClusterName).put("client.transport.sniff", this.esTransactionSniff).put("client.transport.ignore_cluster_name", false).build();
//
//         try {
//             this.client = (new PreBuiltTransportClient(settings, new Class[0])).addTransportAddresses(new TransportAddress[]{new InetSocketTransportAddress(InetAddress.getByName(this.esHost), this.esPort)});
//         } catch (UnknownHostException var3) {
//             this.logger.error("elasticSearch client init failed" + var3.getMessage());
//             var3.printStackTrace();
//             System.exit(1);
//         }
//
//         this.logger.info("elasticSearch client init success: " + this.esHost + ":" + this.esPort + ".");
//     }
//
// }
