package cn.apptec.javainone;

import cn.apptec.javainone.yh.SimpleTypeTest;
import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufIDLGenerator;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaInOneApplicationTests {

    @Test
    public void contextLoads() {
        // example code for usage
        Codec<SimpleTypeTest> simpleTypeCodec = ProtobufProxy
                .create(SimpleTypeTest.class);

        SimpleTypeTest stt = new SimpleTypeTest();
        stt.setName("abc");
        stt.setValue(100);
        try {
            // 序列化
            byte[] bb = simpleTypeCodec.encode(stt);
            // 反序列化
            SimpleTypeTest newStt = simpleTypeCodec.decode(bb);

            String code = ProtobufIDLGenerator.getIDL(SimpleTypeTest.class);

            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
