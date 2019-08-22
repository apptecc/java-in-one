package cn.apptec.javainone.controller;

import cn.apptec.javainone.config.ApptecConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuyangsheng on 2019/8/4.
 *
 * @Description:
 * @Modified By:
 */
@RestController
public class HelloController {

    @Autowired
    private ApptecConfig apptecConfig;

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println(apptecConfig);
        return "hello";
    }
}
