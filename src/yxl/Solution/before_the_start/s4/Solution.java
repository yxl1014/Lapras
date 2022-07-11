package yxl.Solution.before_the_start.s4;

import java.util.Arrays;

/**
 * @Author: yxl
 * @Date: 2022/7/11 14:21
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
