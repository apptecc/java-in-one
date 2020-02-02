package cn.apptec.javainone.design.builder;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class BydCarModel extends CarModel {
    @Override
    void start() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    void stop() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    void alarm() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    void engineBoom() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
