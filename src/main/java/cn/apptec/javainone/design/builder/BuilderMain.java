package cn.apptec.javainone.design.builder;

import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();
        director.getBenzCarModel().run();
        System.out.println("---");
        director.getBydCarModel().run();
    }
}
