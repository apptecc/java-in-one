package cn.apptec.javainone.xprinter.pic;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by liuyangsheng on 2019/8/7.
 *
 * @Description:
 * @Modified By:
 */
@Data
public class Orders implements Serializable {


    private static final long serialVersionUID = -560708444936642252L;

    /**
     * id
     */
    private Integer id;

    /**
     * 寄件人姓名
     */
    private String sendname;

    /**
     * 寄件人电话
     */
    private String sendtel;

    /**
     * 寄件人地址
     */
    private String sendaddress;

    /**
     * 收件人姓名
     */
    private String recname;

    /**
     * 收件人电话
     */
    private String rectel;

    /**
     * 收件人地址
     */
    private String recaddress;

    /**
     * 收件人邮编
     */
    private String reccode;

    /**
     * 订单日期
     */
    private Long orderstime;

    /**
     * 商品类型
     */
    private String goodstype;

    /**
     * 重量 (kg)
     */
    private Double weight;

    /**
     * 体积 (m^3)
     */
    private Double volume;

    /**
     * 配送费
     */
    private Double price;

    /**
     * 报价金额
     */
    private Double insureprice;

    /**
     * 订单类型(0快件, 1慢件,  2大宗)
     */
    private Integer orderstype;

    /**
     * 订单状态 (0未发件, 1已发件, 2已送达,3 已取消,4 正在排件(备用属性，不一定使用), 100前台下单)
     */
    private Integer status;

    /**
     * 条形码编码
     */
    private Long barcode;

    /**
     * 条形码图片
     */
    private String barpic;

    /**
     * 预计到达时间
     */
    private Long endtime;

    /**
     * 配送点姓名
     */
    private String recspname;

    /**
     * 备注
     */
    private String remark;

    /**
     * 客户信息(Id)
     */

    private Integer usid;

    /**
     * 代理点(PID)
     */

    private Integer pid;

    /**
     * 系统管理员id
     */
    private Integer sysid;

    /**
     * 路线(rid)
     */

    private Integer rid;

    /**
     * 凭证，图片
     */
    private String url;

    /**
     * 4个备用字段
     */

    /**
     * 付款方式
     */
    private String res1;

    private String res2;

    private String res3;

    private String res4;

    /**
     * 路线名称
     */
    private String rname;

    /**
     * 路线地址
     */
    private String raddr;

    public Orders() {
        super();
    }

    public Orders(String sendname, String sendtel, String sendaddress, String recname, String rectel, String recaddress, String goodstype, Double price) {
        super();
        this.sendname = sendname;
        this.sendtel = sendtel;
        this.sendaddress = sendaddress;
        this.recname = recname;
        this.rectel = rectel;
        this.recaddress = recaddress;
        this.goodstype = goodstype;
        this.price = price;
    }
}