public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        //do binary search, find minimal m1 let nums1[m1] > nums2[m2 - 1]
        int l = 0;
        int r = nums1.length;
        int k = (nums1.length + nums2.length + 1) / 2;
        while (l < r) {
            int m1 = l + (r - l) / 2;
            int m2 = k - m1;
            if (nums1[m1] < nums2[m2 - 1]) {
                l = m1 + 1;
            } else {
                r = m1;
            }
        }

        int m1 = l;
        int m2 = k - l;

        //calculate left median candidate
        int c1 = Math.max(m1 == 0 ? Integer.MIN_VALUE : nums1[m1 - 1]
                , m2 == 0 ? Integer.MIN_VALUE : nums2[m2 - 1]);

        //return if numbers of total array is odd
        if ((nums1.length + nums2.length) % 2 == 1) {
            return c1;
        }

        //calculate right median candidate (pay attention to board condition)
        int c2 = Math.min(m1 == nums1.length ? Integer.MAX_VALUE : nums1[m1]
                , m2 == nums2.length ? Integer.MAX_VALUE : nums2[m2]);

        double median = (c1 + c2) * 0.5;
        return median;
    }

}
