package cn.apptec.javainone.guava.optional;

import com.google.common.base.Optional;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by liuyangsheng on 2019/8/4.
 *
 * @Description:
 * @Modified By:
 */
public class TestOptional {

    @Test
    public void testOptional() {
        java.util.Optional<Object> optional = Optional.fromNullable(null).toJavaUtil();
        assertThat(null, equalTo(null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAbsent() {
        Optional<Object> absent = Optional.absent();
        absent.get();
    }

    @Test
    public void testAsSet() {
        Set<String> hello = Optional.fromNullable("hello").asSet();
        assertThat(1, equalTo(CollectionUtils.size(hello)));
    }

    @Test
    public void testHashCode() {
        String s = "hello";
        System.out.println(s.hashCode());
        System.out.println(Optional.fromNullable(s).hashCode());
    }

    /**
     * 如果实例存在，则它被转换给定的功能;否则absent()被返回
     *
     * @throws Exception
     */
    @Test
    public void testTransform() throws Exception {
        String hello = Optional.fromNullable("hello").transform(a -> a + a).get();
        assertThat("hellohello", equalTo(hello));

        String s = null;
        Optional<String> optional = Optional.fromNullable(s).transform(a -> a + a);
        assertThat(false, equalTo(optional.isPresent()));
    }
}
