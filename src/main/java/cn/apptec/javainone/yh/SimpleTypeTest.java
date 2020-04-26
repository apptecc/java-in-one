package cn.apptec.javainone.yh;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.baidu.bjf.remoting.protobuf.annotation.ProtobufClass;
import lombok.Data;


/**
 * A simple jprotobuf pojo class just for demo.
 *
 * @author xiemalin
 * @since 1.0.0
 */
@Data
@ProtobufClass
public class SimpleTypeTest {
    @Protobuf(fieldType = FieldType.STRING, order = 1, required = true)
    private String name;

    @Protobuf(fieldType = FieldType.INT32, order = 2, required = false)
    private int value;
}
