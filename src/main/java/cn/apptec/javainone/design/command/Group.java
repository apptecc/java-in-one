package cn.apptec.javainone.design.command;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description: 命令的最终执行对象
 * @Modified By:
 */
public interface Group {
    void find();
    void add();
    void delete();
    void change();
    void plan();

}
