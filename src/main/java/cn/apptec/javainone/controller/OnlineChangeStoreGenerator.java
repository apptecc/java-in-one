package cn.apptec.javainone.controller;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
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

    private static final String shopCodes = "9117,9368,9161,9103,9171,9126";

    public static void main(String[] args) throws IOException, GitAPIException {

        // Splitter.on(",").omitEmptyStrings().splitToList(shopCodes)
        //         .stream().map(p -> String.format(template, p))
        //         .collect(Collectors.toList()).forEach(System.out::println);

        String join = Joiner.on(",").join("abc", Lists.newArrayList("123", "456").toArray(), "def");
        // String join = Joiner.on("','").join(Lists.newArrayList("123", "456").toArray());


        System.out.println(join);
    }
}


