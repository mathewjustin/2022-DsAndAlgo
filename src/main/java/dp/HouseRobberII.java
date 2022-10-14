package dp;

public class HouseRobberII {

    public static void main(String[] args) {
        System.out.println(rob(new int[]{200,3,140,20,10}));
    }

    public static int rob(int[] nums) {

        int[] dp=new int[nums.length];

        if(nums.length<=1)
        {
            return nums[0];
        }
        dp[0]=Math.max(nums[0],nums[nums.length-2]);

        dp[1]=Math.max(dp[0],nums[nums.length-1]+nums[1]);
        if(nums.length<=2)
        {
            return Math.max(nums[0],nums[1]);
        }
        dp[2]=Math.max(Math.max(nums[0],nums[1]),nums[2]);
        if(nums.length<=3)
        {
            return dp[nums.length-1];
        }


      for (int i = 4 ; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];


    }

}
