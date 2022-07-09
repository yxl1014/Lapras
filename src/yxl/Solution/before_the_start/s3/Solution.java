package yxl.Solution.before_the_start.s3;

/**
 * @Author: yxl
 * @Date: 2022/7/9 10:02
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix.length;
        int y = matrix[0].length;
        for (int i = x - 1, j = 0; i >= 0 && j < y; ) {
            if (matrix[i][j] == target)
                return true;
            if (i == 0 || j == y - 1)
                break;
            if (matrix[i - 1][j] >= target) {
                i--;
                continue;
            }
            if (matrix[i][j + 1] >= target) {
                j++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().searchMatrix(new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 5));
    }
    public boolean other(int[][] matrix, int target){
        int col = 0, row = matrix.length - 1;
        while(row >= 0 && col < matrix[0].length){
            if(target > matrix[row][col]){
                col++;
            }else if(target < matrix[row][col]){
                row--;
            }else{
                return true;
            }
        }
        return false;
    }
}
