import java.util.Arrays;


public class HeBingQuJian {

    public static void main(String[] args) {
        System.out.println(Arrays.equals(merge(new int[][]{{1,3},{2,6}, {8,10}, {15,18}}), new int[][]{{1,6}, {8,10}, {15,18}}));
    }

    public static int[][] merge(int[][] intervals) {

        //先排序
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        int[][] result = new int[intervals.length][2];
        int index = -1;
        for (int[] arr : intervals) {
            if (index == -1 || result[index][1] < arr[0]) {
                //不合并
                index++;
                result[index] = arr;
            } else {
                //合并
                result[index][1] = Math.max(result[index][1], arr[1]);
            }
        }
        return Arrays.copyOf(result, index+1);
    }

}
