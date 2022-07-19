package yxl.Solution.string.s1;

/**
 * @Author: yxl
 * @Date: 2022/7/19 11:15
 */
public class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int right = s.length() - 1;
        int left = 0;
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if (!(l >= 'A' && l <= 'Z' || l >= 'a' && l <= 'z')) {
                left++;
                continue;
            }

            if (!(r >= 'A' && r <= 'Z' || r >= 'a' && r <= 'z')) {
                right--;
                continue;
            }
            if (l != r)
                return false;

            left++;
            right--;
        }
        return true;
    }

    //------------------------------------------------------------------------------
    /*
    *   TODO 这属实没想到
        作者：数据结构和算法
        链接：https://leetcode.cn/leetbook/read/top-interview-questions/xah8k6/?discussion=N5yWiB
        来源：力扣（LeetCode）
        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    * */
    public boolean V2(String s){
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new Solution().isPalindrome("race a car"));
        System.out.println(new Solution().isPalindrome("OP"));
    }
}
