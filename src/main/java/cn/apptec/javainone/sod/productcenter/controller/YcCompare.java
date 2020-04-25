package cn.apptec.javainone.sod.productcenter.controller;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 线上商品库(ProductOnline)表控制层
 *
 * @author makejava
 * @since 2020-02-21 09:50:21
 */
@RestController
public class YcCompare {
    public static void main(String[] args) throws Exception {


        //LYSTODO: 2020/3/22 10:18 下午
        List<ShopProduct> me = getMe();
        List<ShopProduct> their = getTheir();

        StringBuilder sb = new StringBuilder();
        Map<String, ShopProduct> theirMap = their.stream().collect(Collectors.toMap(k -> k.getLocationCode() + "_" + k.getProductCode(), Function.identity(),
                (a, b) -> b));

        File file = new File("/Users/lys/Desktop/result.txt");


        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for (ShopProduct m : me) {
            System.out.println("--->" + m.getProductCode());
            ShopProduct t = theirMap.get(m.getLocationCode() + "_" + m.getProductCode());
            theirMap.remove(m.getLocationCode() + "_" + m.getProductCode());
            if (null == t) {
                sb.append(m.toString()).append("\t\t\t\t\t\t\t").append("云创不存在").append("\n");
                continue;
            }
            sb.append(m.toString()).append("\t").append(t.toString()).append("\t");
            if (StringUtils.equalsIgnoreCase(m.getLogisticMode(), YcConvertorMap.logisticsModeCodeMap.inverse().get(t.getLogisticMode()))) {
                sb.append("\t");
            } else {
                sb.append("\t物流不一致");
            }
            if (StringUtils.equalsIgnoreCase(m.getValidTag(), YcConvertorMap.validTagMap.inverse().get(t.getValidTag()))) {
                sb.append("\t");
            } else {
                sb.append("\t有效标识不一致");
            }
            if (StringUtils.equalsIgnoreCase(m.getStatus(), YcConvertorMap.productStatusMap.inverse().get(t.getStatus()))) {
                sb.append("\t");
            } else {
                sb.append("\t状态不一致");
            }
            if (StringUtils.equalsIgnoreCase(m.getBizType(), YcConvertorMap.bizTypeMap.inverse().get(t.getBizType()))) {
                sb.append("\t");
            } else {
                sb.append("\t经营方式不一致");
            }
            sb.append("\n");
            bw.write(sb.toString());
            sb = new StringBuilder();
            bw.flush();
        }

        if (theirMap.size() > 0) {
            for (Map.Entry<String, ShopProduct> entry : theirMap.entrySet()) {
                sb.append("\t\t\t\t\t\t").append(entry.getValue().toString()).append("\t云超不存在").append("\n");
                bw.write(sb.toString());
                sb = new StringBuilder();
                bw.flush();
            }
        }
        bw.flush();
        bw.close();
        System.out.println(sb.toString());



    }

    private static List<ShopProduct> getMe() throws IOException {
        List<ShopProduct> me = new ArrayList<>();
        InputStream is = YcCompare.class.getClassLoader().getResourceAsStream("me.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String meLine = "";
        do {
            meLine = br.readLine();
            if (StringUtils.isBlank(meLine)) {
                break;
            }
            List<String> strings = Splitter.on(Pattern.compile("\\s+")).splitToList(meLine);
            ShopProduct e = new ShopProduct();
            e.setLocationCode(strings.get(1));
            e.setProductCode(strings.get(0));
            e.setLogisticMode(strings.get(3));
            e.setValidTag(strings.get(5));
            e.setStatus(strings.get(2));
            e.setBizType(strings.get(4));

            me.add(e);
        } while (StringUtils.isNotBlank(meLine));
        return me;
    }

    private static List<ShopProduct> getTheir() throws IOException {
        List<ShopProduct> me = new ArrayList<>();
        InputStream is = YcCompare.class.getClassLoader().getResourceAsStream("their.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String meLine = "";
        do {
            meLine = br.readLine();
            if (StringUtils.isBlank(meLine)) {
                break;
            }
            List<String> strings = Splitter.on(Pattern.compile("\\t")).splitToList(meLine);
            ShopProduct e = new ShopProduct();
            e.setLocationCode(strings.get(0));
            e.setProductCode(strings.get(1));
            e.setValidTag(strings.get(3).split("-")[0]);
            e.setBizType(strings.get(6).split("-")[0]);
            e.setStatus(strings.get(2).split("-")[0]);
            e.setLogisticMode(strings.get(4).split("-")[0]);
            me.add(e
            );
        } while (StringUtils.isNotBlank(meLine));
        return me;
    }

    // 商品	地点	特定地点的商品状态	物流模式	经营方式	有效标识


}


