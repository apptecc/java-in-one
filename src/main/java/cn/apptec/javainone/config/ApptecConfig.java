package cn.apptec.javainone.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

/**
 * Created by liuyangsheng on 2019/8/14.
 *
 * @Description:
 * @Modified By:
 */
@Component
@ConfigurationProperties(prefix = "apptec")
@Data
public class ApptecConfig {
    private String name;
    private String age;
    private String name2;
    private String age2;
    private String name3;
    private String age3;
    private String name4;
    private String age4;
    private String name5;
    private String age5;

    public static void main(String[] args) {


    }

    public ApptecConfig convertFrom(ApptecConfig x) {
        ApptecConfig apptecConfig = new ApptecConfig();
        
        apptecConfig.setName(Optional.ofNullable(x.getName()).orElse(null));


        if(null == x.getName()) apptecConfig.setName(x.getName());
        
        apptecConfig.setName(x.getName());
        apptecConfig.setAge(x.getAge());
        apptecConfig.setName2(x.getName2());
        apptecConfig.setAge2(x.getAge2());
        apptecConfig.setName3(x.getName3());
        apptecConfig.setAge3(x.getAge3());
        apptecConfig.setName4(x.getName4());
        apptecConfig.setAge4(x.getAge4());
        apptecConfig.setName5(x.getName5());
        apptecConfig.setAge5(x.getAge5());
        return apptecConfig;

    }
}
