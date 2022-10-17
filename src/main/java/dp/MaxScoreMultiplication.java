package dp;

/**
 * @author Justin Mathew
 * https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/
 */
public class MaxScoreMultiplication {

    public static void main(String[] args) {

        int nums[]=new int[]{1,2,3};

        int mults[]=new int[]{3,2,1};

        System.out.printf("MaxScore = "+maximumScore(nums,mults));
    }

    static int  dp(Integer[][] memo, int[] nums, int[] multipliers, int op, int left) {
        // For Right Pointer
        int n = nums.length;
        if (op == multipliers.length) {
            return 0;
        }

        // If already computed, return
        if (memo[op][left] != null) {
            return memo[op][left];
        }

        int l = nums[left] * multipliers[op] + dp(memo, nums, multipliers, op + 1, left + 1);
        int r = nums[(n - 1) - (op - left)] * multipliers[op] + dp(memo, nums, multipliers, op + 1, left);

        return memo[op][left] = Math.max(l, r);
    }

    public static int maximumScore(int[] nums, int[] multipliers) {
        Integer[][] memo = new Integer[multipliers.length + 1][multipliers.length + 1];
        // Zero operation done in the beginning
        return dp(memo, nums, multipliers, 0, 0);
    }
}
