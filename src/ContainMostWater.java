public class ContainMostWater {

    public int solution(int[] height) {
        int l = 0;
        int r = height.length -1;
        int max = 0;
        while (l < r) {
            int lh = height[l];
            int rh = height[r];
            int temp = Math.min(lh, rh) * (r - l);
            max = temp > max ? temp : max;
            if (lh < rh) {
                do {l++;}while(l < r && height[l] < lh);
            } else {
                do {r--;}while(l < r && height[r] < rh);
            }
        }
        return max;
    }

}
