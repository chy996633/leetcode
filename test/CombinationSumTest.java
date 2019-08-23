import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author <a herf="chenhy@itek-china.com">陈海越</a>
 * @version 1.0
 * @since 新标准版5.0
 *
 * <pre>
 * 历史：
 *      建立: 2019/8/24 陈海越
 *        </pre>
 */

public class CombinationSumTest {

    @Test
    public void test() {
        CombinationSum cs = new CombinationSum();
        List<List<Integer>> result = cs.combine(new int[]{3,2,5}, 8);
        assertEquals(new ArrayList<List<Integer>>() {
            {
                add(Arrays.asList(2,2,2,2));
                add(Arrays.asList(2,3,3));
                add(Arrays.asList(3,5));
            }
        }, result);
    }


    @Test
    public void testUnique() {
        CombinationSum cs = new CombinationSum();
        List<List<Integer>> result = cs.combineUnique(new int[]{10,1,2,7,6,1,5}, 8);
        assertEquals(new ArrayList<List<Integer>>() {
            {
                add(Arrays.asList(1, 1, 6));
                add(Arrays.asList(1, 2, 5));
                add(Arrays.asList(1, 7));
                add(Arrays.asList(2, 6));

            }
        }, result);
    }

}
