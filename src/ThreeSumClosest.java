import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;
        int delta = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int a = nums[i];
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int diff = Math.abs(nums[j] + nums[k] + a - target);
                if (diff < delta) {
                    delta = diff;
                    result = nums[j] + nums[k] + a;
                    if (delta == 0) {
                        return result;
                    }
                }
                if (nums[j] + nums[k] + a < target) {
                    j++;
                } else {
                    k--;
                }
            }

        }
        return result;
    }


}
