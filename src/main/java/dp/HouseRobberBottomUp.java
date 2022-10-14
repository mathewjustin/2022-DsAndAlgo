package dp;

import java.util.HashMap;

public class HouseRobberBottomUp {

    public static void main(String[] args) {
        rob(new int[]{2,3,1,2,4});
    }

     public static int rob(int[] nums) {

        int[] dp=new int[nums.length];


        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];


    }



}
