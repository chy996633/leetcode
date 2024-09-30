package array;

/**
 * https://leetcode.cn/problems/car-pooling/description/
 *
 * 车上最初有 capacity 个空座位。车 只能 向一个方向行驶（也就是说，不允许掉头或改变方向）
 * 给定整数 capacity 和一个数组 trips ,  trip[i] = [numPassengersi, fromi, toi] 表示第 i 次旅行有 numPassengersi 乘客，接他们和放他们的位置分别是 fromi 和 toi 。这些位置是从汽车的初始位置向东的公里数。
 * 当且仅当你可以在所有给定的行程中接送所有乘客时，返回 true，否则请返回 false。
 *
 * 示例 1：
 *
 * 输入：trips = [[2,1,5],[3,3,7]], capacity = 4
 * 输出：false
 * 示例 2：
 *
 * 输入：trips = [[2,1,5],[3,3,7]], capacity = 5
 * 输出：true
 *
 * 提示：
 *
 * 1 <= trips.length <= 1000
 * trips[i].length == 3
 * 1 <= numPassengersi <= 100
 * 0 <= fromi < toi <= 1000
 * 1 <= capacity <= 105
 */
public class CarPooling {

    /**
     * 使用差分数组技巧，减少 数组的索引区间累加时间
     * @param trips
     * @param capacity
     * @return
     */
    public boolean carPooling(int[][] trips, int capacity) {

        int toMax = 0;
        // 遍历trips数组，找到最大的toIndex
        for (int[] trip : trips) {
            toMax = Math.max(toMax, trip[2]);
        }

        // diff长度为最大下标 + 1
        int[] diff = new int[toMax + 1];
        // 遍历trips，构建差分数组
        for (int[] trip : trips) {
            int num = trip[0];
            int i = trip[1];
            int j = trip[2];
            diff[i] += num;
            diff[j] -= num;
        }

        int cur = 0;
        // 还原数组，看最大值是否超过capacity
        for (int i = 0; i < diff.length; i++) {
            cur += diff[i];
            if (cur > capacity) {
                return false;
            }
        }

        // 返回
        return true;
    }

}
