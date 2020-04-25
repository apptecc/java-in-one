package cn.apptec.javainone;


import com.google.protobuf.InvalidProtocolBufferException;
import com.jet.protobuf.ProductInfoProto;

/**
 * Created by liuyangsheng on 2020/4/25.
 *
 * @Description:
 * @Modified By:
 */

public class PersonProtoTest {


    public static void main(String[] args) throws InvalidProtocolBufferException {
        ProductInfoProto.ProductInfo.Builder builder = ProductInfoProto.ProductInfo.newBuilder();
        builder.setId("888");
        builder.setEnProductName("EN-name");
        builder.setProductCode("734235");
        builder.setProductName("name");
        builder.setProductType("product-type");

        ProductInfoProto.ProductInfo productInfo = builder.build();

        byte[] bytes = productInfo.toByteArray();

        ProductInfoProto.ProductInfo productInfo1 = ProductInfoProto.ProductInfo.parseFrom(bytes);

        System.out.println();

    }


}
