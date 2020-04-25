package cn.apptec.javainone;

import cn.apptec.javainone.factory.simple.BlackHuman;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaInOneApplicationTests {

    @Test
    public void contextLoads() {

        DefaultReflectorFactory drf = new DefaultReflectorFactory();
        Reflector blackHumanReflector = drf.findForClass(BlackHuman.class);
        for (String getablePropertyName : blackHumanReflector.getGetablePropertyNames()) {
            System.out.println(getablePropertyName);
        }
    }

}
