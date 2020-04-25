package cn.apptec.javainone.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import com.jet.protobuf.ProductInfoProto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuyangsheng on 2019/8/4.
 *
 * @Description:
 * @Modified By:
 */
@RestController
public class ProtoController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    @Qualifier("stringObjectRedisTemplate")
    private RedisTemplate<String, Object> stringObjectRedisTemplate;

    @GetMapping("/prototest")
    public String sayHello() throws InvalidProtocolBufferException {
        ProductInfoProto.ProductInfo.Builder builder = ProductInfoProto.ProductInfo.newBuilder();
        builder.setId("888");
        builder.setEnProductName("EN-name");
        builder.setProductCode("734235");
        builder.setProductName("name");
        builder.setProductType("product-type");

        ProductInfoProto.ProductInfo productInfo = builder.build();
        byte[] bytes = productInfo.toByteArray();
        stringObjectRedisTemplate.boundValueOps("abc").set(bytes);
        ProductInfoProto.ProductInfo productInfo1 = ProductInfoProto.ProductInfo.parseFrom(bytes);
        return productInfo1.toString();

    }

    @GetMapping("/getproto")
    public String getproto() throws InvalidProtocolBufferException {
        Object abc = stringObjectRedisTemplate.boundValueOps("abc").get();
        ProductInfoProto.ProductInfo productInfo1 = ProductInfoProto.ProductInfo.parseFrom((byte[]) abc);
        return productInfo1.toString();

    }
}
