import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
public class Subset {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrace(result, new LinkedList<>(), nums, 0);
        return result;
    }

    public void backtrace(List<List<Integer>> result,
                          LinkedList<Integer> intList, int[] nums,
                          int index) {
        result.add(new LinkedList<>(intList));
        for (int i = index; i < nums.length; i++) {
            intList.addLast(nums[i]);
            backtrace(result, intList, nums, i + 1);
            intList.removeLast();
        }
    }

    public List<List<Integer>> subsetDuplicates(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtraceDuplicates(result, new LinkedList<>(), nums, 0);
        return result;
    }

    public void backtraceDuplicates(List<List<Integer>> result,
                                    LinkedList<Integer> intList,
                                    int[] nums, int index) {
        result.add(new LinkedList<>(intList));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            intList.add(nums[i]);
            backtraceDuplicates(result, intList, nums, i + 1);
            intList.removeLast();
        }
    }

}
