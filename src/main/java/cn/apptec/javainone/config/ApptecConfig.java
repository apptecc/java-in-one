package cn.apptec.javainone.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

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
}
