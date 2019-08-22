package cn.apptec.javainone.controller;

import com.google.common.base.Splitter;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.IOException;
import java.util.stream.Collectors;

/**
 * Created by liuyangsheng on 2019/8/4.
 *
 * @Description:
 * @Modified By:
 */
public class OnlineChangeStoreGenerator {

    private static final String template = "INSERT ignore INTO yh_sod_cmscenter_shopcode (shop_code, created_by, update_by) VALUES ('%s', 'sys', 'sys');";

    private static final String shopCodes = "9117,9161,9147,9237,9095,9316,9114,9088,9103,9360,9300,9384,9290,9170,9176,9185,9447,9287,9096,9451,9090,9284,9460,9812,9093,9132,9385,9107,9080,9462,9084,9145,9317,9517,9289,9126,9254,9108,9082";

    public static void main(String[] args) throws IOException, GitAPIException {

        Splitter.on(",").omitEmptyStrings().splitToList(shopCodes)
                .stream().map(p -> String.format(template, p))
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}


