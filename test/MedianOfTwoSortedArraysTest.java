import static org.junit.Assert.*;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void findMedianSortedArrays() {
        MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
        assertEquals(6.5
                , m.findMedianSortedArrays(
                        new int[]{ -1, 1, 3, 5, 7, 9 },
                        new int[]{ 2, 4, 6, 8, 10, 12, 14, 16 })
                , 0.01
        );
        assertEquals(2
                , m.findMedianSortedArrays(
                        new int[]{ 1, 3},
                        new int[]{ 2 })
                , 0.01
        );
    }
}