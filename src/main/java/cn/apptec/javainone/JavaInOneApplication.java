package cn.apptec.javainone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.apptec.javainone.sod.productcenter.dao")
public class JavaInOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaInOneApplication.class, args);
    }

}
