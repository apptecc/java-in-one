package cn.apptec.javainone.guava.optional;

import com.google.common.collect.Ordering;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by liuyangsheng on 2019/8/4.
 *
 * @Description:
 * @Modified By:
 */
public class TestOrdering {
    List<String> list;

    @Before
    public void before() {
        list = IntStream.range(1, 10).boxed().map(String::valueOf).collect(Collectors.toList());
    }

    @Test
    public void testAllEqual() {
        Ordering<Object> objectOrdering = Ordering.allEqual();
        list.sort(objectOrdering);
        System.out.println(list);
    }

    @Test
    public void testArbitrary() {
        Ordering<Object> arbitrary = Ordering.arbitrary();
        list.sort(arbitrary);
        list.sort(arbitrary);
        list.sort(arbitrary);
        System.out.println(list);
    }

    @Test
    public void testBinarySearch() {

    }
}
