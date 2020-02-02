package cn.apptec.javainone.design.command;

/**
 * Created by liuyangsheng on 2020/2/2.
 *
 * @Description:
 * @Modified By:
 */
public class PageGroup implements Group {
    @Override
    public void find() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName() +
                "->" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void add() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName() +
                "->" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void delete() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName() +
                "->" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void change() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName() +
                "->" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void plan() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName() +
                "->" + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
