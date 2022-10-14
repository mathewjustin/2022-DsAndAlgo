package dp;

import java.util.HashMap;

public class HouseRobber {


    private int[] nums;

    HashMap<Integer,Integer>memory=new HashMap<>();
    public int rob(int[] nums) {

        this.nums = nums;

        return dp(nums.length);

    }

    private int dp(int i) {
        if(i==0) return nums[0];
        if(i==1) return Math.max(nums[0],nums[1]);


            if(memory.get(i)==null)
            {
                memory.put(i,Math.max(dp(i-1),dp(i-2)+nums[i]));
            }

        return memory.get(i);
    }

}
