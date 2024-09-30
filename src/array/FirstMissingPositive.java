package array;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        //第一轮循环，判断数组中是否存在1，不存在就直接返回1
        int flag = 0;
        for (int num : nums) {
            if (num == 1) {
                flag = 1;
            }
        }

        if (flag == 0) {
            return 1;
        }

        // 第二轮循环，简化数组。如果存在小于等于0或大于n的数字，将该数字置为1。
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num <= 0 || num > n) {
                nums[i] = 1;
            }
        }

        // 第三轮循环，标记数字。数字a对应下标a-1的数组元素，如果数字a存在，对应元素标记为负。注意数字符号只改变一次。
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int index= Math.abs(num) - 1;
            nums[index] = -Math.abs(nums[index]);
        }

        // 第四轮循环，找到第一个非负的数字，返回下标+1
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > 0) {
                return i + 1;
            }
        }

        // 极端情况，数组中不缺少正整数，则返回数组长度+1的数字就行
        return n + 1;
    }

    public static void main(String[] args) {

    }



}
