package cn.apptec.javainone.factory.simple;

import lombok.Getter;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public enum ColorEnum {
    BLACK("black", "黑人"),
    YELLOW("yellow", "黄种人"),
    WHITE("white", "白人");

    @Getter
    private String color;
    @Getter
    private String desc;

    ColorEnum(String color, String desc) {
        this.color = color;
        this.desc = desc;
    }
}
