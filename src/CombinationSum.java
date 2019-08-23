import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author <a herf="chenhy@itek-china.com">陈海越</a>
 * @version 1.0
 * @since 新标准版5.0
 *
 * <pre>
 * 历史：
 *      建立: 2019/8/23 陈海越
 *        </pre>
 */
public class CombinationSum {

    public List<List<Integer>> combine(int[] candidates, int target) {
        Integer[] objects =
                IntStream.of(candidates).boxed().toArray(Integer[]::new);
        Arrays.sort(objects);
        List<List<Integer>> result = new ArrayList<>();
        if (target > 0) {
            backtrace(result, new ArrayList<>(), target, objects, 0);
        }
        return result;
    }

    private void backtrace(List<List<Integer>> result,
                           List<Integer> arr, int remain,
                           Integer[] candidates, int index) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            result.add(new ArrayList<>(arr));
        } else {
            for (int i = index; i < candidates.length; i++) {
                arr.add(candidates[i]);
                backtrace(result, arr, remain - candidates[i],
                        candidates, i);
                arr.remove(arr.size() - 1);
            }
        }
    }

    public List<List<Integer>> combineUnique(int[] candidates,
                                             int target) {
        Integer[] objects =
                IntStream.of(candidates).boxed().toArray(Integer[]::new);
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(objects);
        if (target > 0) {
            backtraceUnqiue(result, new ArrayList<>(), target,
                    objects, 0);
        }
        return result;
    }

    private void backtraceUnqiue(List<List<Integer>> result,
                                 List<Integer> arr, int remain,
                                 Integer[] candidates, int index) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            if (!result.contains(arr)) {
                result.add(new ArrayList<>(arr));
            }
        } else {
            for (int i = index; i < candidates.length; i++) {
                arr.add(candidates[i]);
                backtraceUnqiue(result, arr, remain - candidates[i],
                        candidates, i + 1);
                arr.remove(arr.size() - 1);
            }
        }
    }


}
