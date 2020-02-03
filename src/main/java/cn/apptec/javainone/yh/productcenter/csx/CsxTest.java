package cn.apptec.javainone.yh.productcenter.csx;

import okhttp3.*;

import java.io.IOException;

/**
 * Created by liuyangsheng on 2020/2/3.
 *
 * @Description: 新品引入PI接口测试
 * @Modified By:
 */
public class CsxTest {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/octet-stream");
        RequestBody body = RequestBody.create(mediaType, "{\n" +
                "\t\"I_JIEKNO\": \"skuBasicEccApi001\",\n" +
                "\t\"I_INPUT\": {\n" +
                "\t\t\"SHEETID\": \"A15773455472700050C14\",\n" +
                "\t\t\"YORGFLG\": \"YC\",\n" +
                "\t\t\"UPWAYS\": \"C\",\n" +
                "\t\t\"ITEMS\": {\"item\":[{\n" +
                "\t\t\t\"Row\": \"0\",\n" +
                "\t\t\t\"SERNO\": \"2\",\n" +
                "\t\t\t\"MATNR\": null,\n" +
                "\t\t\t\"MAKTX\": \"90g香飘飘黑糖双拼奶茶(1 * 30)\",\n" +
                "\t\t\t\"YNAME2\": \"90g香飘飘黑糖双拼奶茶(1 * 30)\",\n" +
                "\t\t\t\"MEINS\": \"49\",\n" +
                "\t\t\t\"MATKL\": \"12460204\",\n" +
                "\t\t\t\"MTART\": \"Z001\",\n" +
                "\t\t\t\"ATTYP\": \"00\",\n" +
                "\t\t\t\"MBRSH\": \"1\",\n" +
                "\t\t\t\"SPART\": \"10\",\n" +
                "\t\t\t\"PRDHA\": \"0002934\",\n" +
                "\t\t\t\"TAKLV\": \"A\",\n" +
                "\t\t\t\"BKLAS\": null,\n" +
                "\t\t\t\"YWHERR\": \"湖州\",\n" +
                "\t\t\t\"TEMPB\": \"01\",\n" +
                "\t\t\t\"EKGRP\": \"A03\",\n" +
                "\t\t\t\"YSAISO\": \"0001\",\n" +
                "\t\t\t\"MHDHB\": \"360\",\n" +
                "\t\t\t\"GROES\": \"90g\",\n" +
                "\t\t\t\"YPCGRDM\": \"05\",\n" +
                "\t\t\t\"YBCTYP\": \"10\",\n" +
                "\t\t\t\"YNCSRY\": \"N\",\n" +
                "\t\t\t\"EAN11\": \"6938888880848\",\n" +
                "\t\t\t\"NUMTP\": null,\n" +
                "\t\t\t\"YYGJAHR\": null,\n" +
                "\t\t\t\"PRICEDAI\": null,\n" +
                "\t\t\t\"YTAXINPR\": \"5.2000\",\n" +
                "\t\t\t\"YTAXSAPR\": \"6.8000\",\n" +
                "\t\t\t\"YYMIANL\": null,\n" +
                "\t\t\t\"YYSTYLE\": null,\n" +
                "\t\t\t\"YYMANXIN\": null,\n" +
                "\t\t\t\"YGROES\": null,\n" +
                "\t\t\t\"LAENG\": \"16.000000\",\n" +
                "\t\t\t\"BREIT\": \"8.000000\",\n" +
                "\t\t\t\"HOEHE\": \"5.000000\",\n" +
                "\t\t\t\"MEABM\": \"201\",\n" +
                "\t\t\t\"YYSIZE\": null,\n" +
                "\t\t\t\"YYCOLOR\": null,\n" +
                "\t\t\t\"WHERL\": null,\n" +
                "\t\t\t\"YSPSFL\": null,\n" +
                "\t\t\t\"YORGFLG\": null\n" +
                "\t\t}]}\n" +
                "\t}\n" +
                "}");
        Request request = new Request.Builder()
                .url("http://10.1.31.19:50000/RESTAdapter/RME/MAST0075U")
                .post(body)
                .addHeader("authorization", Credentials.basic("RME_D", "1234qwer")).build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}

/**
 <dependency>
 <groupId>com.squareup.okhttp3</groupId>
 <artifactId>okhttp</artifactId>
 <version>4.2.2</version>
 </dependency>
 */

/**
 {
 "I_JIEKNO": "skuBasicEccApi001",
 "I_INPUT": {
 "SHEETID": "A15773455472700050C14",
 "YORGFLG": "YC",
 "UPWAYS": "C",
 "ITEMS": {"item":[{
 "Row": "0",
 "SERNO": "2",
 "MATNR": null,
 "MAKTX": "90g香飘飘黑糖双拼奶茶(1 * 30)",
 "YNAME2": "90g香飘飘黑糖双拼奶茶(1 * 30)",
 "MEINS": "49",
 "MATKL": "12460204",
 "MTART": "Z001",
 "ATTYP": "00",
 "MBRSH": "1",
 "SPART": "10",
 "PRDHA": "0002934",
 "TAKLV": "A",
 "BKLAS": null,
 "YWHERR": "湖州",
 "TEMPB": "01",
 "EKGRP": "A03",
 "YSAISO": "0001",
 "MHDHB": "360",
 "GROES": "90g",
 "YPCGRDM": "05",
 "YBCTYP": "10",
 "YNCSRY": "N",
 "EAN11": "6938888880848",
 "NUMTP": null,
 "YYGJAHR": null,
 "PRICEDAI": null,
 "YTAXINPR": "5.2000",
 "YTAXSAPR": "6.8000",
 "YYMIANL": null,
 "YYSTYLE": null,
 "YYMANXIN": null,
 "YGROES": null,
 "LAENG": "16.000000",
 "BREIT": "8.000000",
 "HOEHE": "5.000000",
 "MEABM": "201",
 "YYSIZE": null,
 "YYCOLOR": null,
 "WHERL": null,
 "YSPSFL": null,
 "YORGFLG": null
 }]}
 }
 }

 */
