package cn.apptec.javainone.design.prototype;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

/**
 *
 * @author liuyangsheng
 * @date 2020/2/2
 *
 * @Description:
 * @Modified By:
 */
public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setAge(20);
        person.setName("apptec");
        person.setHobbies(Lists.newArrayList("swim", "type"));
        Person clone = (Person) person.clone();
        clone.getHobbies().add("pingpong");
        System.out.println(JSON.toJSONString(person));
        person.setAge(30);
        System.out.println(clone.getAge());
    }
}
