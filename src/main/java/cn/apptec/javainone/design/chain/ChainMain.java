package cn.apptec.javainone.design.chain;

/**
 * Created by liuyangsheng on 2020/2/3.
 *
 * @Description:
 * @Modified By:
 */
public class ChainMain {
    public static void main(String[] args) {
        IWoman w = new Panjinlian();
        Handler dalang = new Wudalang();
        Handler father = new PanFather(dalang);
        father.tryHandle(w);
    }
}
