package yxl.Solution.before_the_start.s5;

/**
 * @Author: yxl
 * @Date: 2022/7/18 11:19
 */
public class Solution {
    public int superEggDrop(int k, int n) {
        int res = 0;

        boolean lastEgg = k == 1;
        int left = 1, right = n;

        while (true) {
            if (lastEgg) {
                for (int i = left; i <= right; i++) {
                    res++;
                }
                break;
            } else {
                int mid = (right + left) / 2;
                res++;
                k--;
                lastEgg = k == 1;
                left = mid;
            }
        }

        return res;
    }
    /*
    *-------------------------------------------------------------------------------------------------------------------
    作者：shenju
    链接：https://leetcode.cn/leetbook/read/top-interview-questions/xmup75/?discussion=YgAHBI
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    * */
    int superEggDrop_V1(int K, int N) {
        int remainTestCount = 1;//穷举移动次数（测试的次数）
        while (getConfirmFloors(remainTestCount, K) < N){
            ++remainTestCount;
        }
        return remainTestCount;
    }
    //在remainTestCount个测试机会（扔鸡蛋的机会 或者移动的次数），eggsCount个鸡蛋可以确定的楼层数量
    int getConfirmFloors(int remainTestCount, int eggsCount){
        if (remainTestCount == 1 || eggsCount == 1){
//如果remainTestCount == 1你只能移动一次，则你只能确定第一楼是否，也就是说鸡蛋只能放在第一楼，如果碎了，则F == 0，如果鸡蛋没碎，则F == 1
//如果eggsCount == 1鸡蛋数为1，它碎了你就没有鸡蛋了，为了保险，你只能从第一楼开始逐渐往上测试，如果第一楼碎了（同上），
// 第一楼没碎继续测第i楼，蛋式你不可能无限制的测试，因为你只能测试remainTestCount次
            return remainTestCount;
        }
        return getConfirmFloors(remainTestCount - 1, eggsCount - 1) +
                1 +
                getConfirmFloors(remainTestCount - 1, eggsCount);
    }

}
