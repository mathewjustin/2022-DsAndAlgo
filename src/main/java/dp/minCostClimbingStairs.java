package dp;

import java.util.HashMap;

public class minCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {

        int[] dp=new int[cost.length+1];


        for(int i=2;i<dp.length;i++)
        {
            dp[i]=Math.min((dp[i-1]+cost[i-1]),(dp[i-2]+cost[i-2]));
        }
        return dp[dp.length-1];

    }



    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
    }

}
