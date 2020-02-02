package cn.apptec.javainone.design.simple;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description: 国王类, 全局只有一个
 * @Modified By:
 */
public class Emperor {
    private static final Emperor instance = new Emperor();

    private Emperor() {

    }

    public static Emperor getInstance() {
        return instance;
    }

    public String say(String words) {
        return "hello" + words;
    }
}
