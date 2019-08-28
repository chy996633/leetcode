import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
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
public class SubsetTest {

    @Test
    public void test() {

        Subset subset = new Subset();
        List<List<Integer>> result = subset.subsets(new int[] {1,2,3});
        assertEquals(new ArrayList<List<Integer>>() {
            {
                add(new LinkedList<>(Collections.emptyList()));
                add(new LinkedList<>(Arrays.asList(1)));
                add(new LinkedList<>(Arrays.asList(1, 2)));
                add(new LinkedList<>(Arrays.asList(1, 2, 3)));
                add(new LinkedList<>(Arrays.asList(1, 3)));
                add(new LinkedList<>(Arrays.asList(2)));
                add(new LinkedList<>(Arrays.asList(2, 3)));
                add(new LinkedList<>(Arrays.asList(3)));
            }
        },  result);
    }

    @Test
    public void testDuplicates() {
        Subset subset = new Subset();
        List<List<Integer>> result = subset.subsetDuplicates(new int[] {1,2,2});
        assertEquals(new ArrayList<List<Integer>>() {
            {
                add(new LinkedList<>(Collections.emptyList()));
                add(new LinkedList<>(Arrays.asList(1)));
                add(new LinkedList<>(Arrays.asList(1, 2)));
                add(new LinkedList<>(Arrays.asList(1, 2, 2)));
                add(new LinkedList<>(Arrays.asList(2)));
                add(new LinkedList<>(Arrays.asList(2, 2)));
            }
        },  result);
    }

}
