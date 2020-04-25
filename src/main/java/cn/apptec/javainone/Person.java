package cn.apptec.javainone;

import lombok.Data;

@Data
public class Person {
    private int id;
    private String name;
    private String uniqNameSecond;

    public String HelloWorld() {
        return uniqNameSecond;
    }

    public static void main(String[] args) {
        Boolean isRepeat = true;
        int defFlag = 0;
        if(isRepeat && defFlag == 0){
            System.out.println("hello");
        } else {
            System.out.println("hello2");
        }


    }


}
