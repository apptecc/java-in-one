package cn.apptec.javainone.controller;

import cn.apptec.javainone.config.ApptecConfig;
import com.google.common.base.Splitter;
import org.apache.tomcat.util.buf.HexUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liuyangsheng on 2019/8/4.
 *
 * @Description:
 * @Modified By:
 */
public class HelloDex {

    public static void main(String[] args) {
        // String s = "29 107 73 10 123 66 78 111 46 123 67 88 88 88";
        String s = "29 107 73 10 123 66 80 80 80 123 67 88 88 88";
        List<String> strings = Splitter.on(" ").splitToList(s);
        for (String string : strings) {
            System.out.print(Integer.toHexString(Integer.valueOf(string)) + " ");
        }

        System.out.println();
        System.out.println(Integer.valueOf('P'));
        System.out.println('P');
        System.out.println('P');
    }
}
