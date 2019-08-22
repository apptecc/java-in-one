package cn.apptec.javainone.guava.optional;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by liuyangsheng on 2019/8/4.
 *
 * @Description:
 * @Modified By:
 */
public class TestFlatmap {
    List<String> list;
    List<String> list2;
    Integer[] intArr;
    Integer[] intArr2;

    @Before
    public void before() {
        list = IntStream.rangeClosed(1, 10).boxed().map(String::valueOf).collect(Collectors.toList());
        list2 = IntStream.rangeClosed(11, 20).boxed().map(String::valueOf).collect(Collectors.toList());

        intArr = IntStream.rangeClosed(1, 10).boxed().toArray(Integer[]::new);
        intArr2 = IntStream.rangeClosed(11, 20).boxed().toArray(Integer[]::new);
    }


    @Test
    public void testFlatmap() {
        Stream.of(list, list2).flatMap(List::stream).forEach(System.out::print);
        System.out.println("\n--------------------");
        Stream.of(intArr, intArr2).flatMap(Arrays::stream).forEach(System.out::print);
    }
}
