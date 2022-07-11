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

    public void merge_V2(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] res = new int[m];
        while (k < m) {
            if (nums1[i] <= nums2[j] && i < m - n) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }

        System.arraycopy(res, 0, nums1, 0, m);
    }


    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        new Solution().merge_V2(num1, 6, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(num1));
    }
}
