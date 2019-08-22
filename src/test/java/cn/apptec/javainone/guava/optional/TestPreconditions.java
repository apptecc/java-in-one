package cn.apptec.javainone.guava.optional;

import com.google.common.base.Preconditions;
import org.junit.Test;

/**
 * Created by liuyangsheng on 2019/8/4.
 *
 * @Description:
 * @Modified By:
 */
public class TestPreconditions {

    @Test(expected = IllegalArgumentException.class)
    public void testCheckArgument() {
        Preconditions.checkArgument(true, "no errorMessage");
        Preconditions.checkArgument(false, "has errorMessage");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testCheckElementIndex() {
        //ok
        Preconditions.checkElementIndex(0, 20);
        //error
        Preconditions.checkElementIndex(20, 20);
    }
}
