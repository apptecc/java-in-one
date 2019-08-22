package cn.apptec.javainone.xprinter.pic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyangsheng on 2019/8/7.
 *
 * @Description:
 * @Modified By:
 */
public class JustTest {
    public static void main(String[] args) {
        List<Orders> goods = new ArrayList<Orders>();
        String sendname = "hahahahahahahahah刘阳生ahahahahahahahahaha";
        String sendtel = "ssdfa";
        String sendaddress = "addreee";
        String recname = "name";
        String rectel = "2123123123";
        String recaddress = "addddd";
        String goodstype = "flakdjfa";
        Double price = 233.33;
        goods.add(new Orders(sendname, sendtel, sendaddress, recname, rectel, recaddress, goodstype, price));
        SalesTicket stk = new SalesTicket(goods, "俊峰股份", "" + "342342", "3", "38400", "38400", "0");
        YcPrinter p = new YcPrinter(stk);
        p.printer();

    }
}
