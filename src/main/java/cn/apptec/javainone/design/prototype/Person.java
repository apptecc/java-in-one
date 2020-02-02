package cn.apptec.javainone.design.prototype;

import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
@Data
public class Person implements Cloneable {
    private String name;
    private List<String> hobbies;
    private Integer age;

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.setHobbies(hobbies.stream().collect(Collectors.toList()));
        return clone;
    }
}
