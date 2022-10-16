package dp;

import java.util.HashMap;

/**
 * @author Justin Mathew
 * A top down approach to Delete and Earn problem
 */
public class DeleteAndEarnTopDown {
    public static void main(String[] args) {

        int number[]=new int[]{2,2,3,3,3,4};
        System.out.printf(""+deleteAndEarn(number));
    }



    private static HashMap<Integer, Integer> points = new HashMap<>();
    public static int deleteAndEarn(int[] nums) {

        int max=0;
        for (int num: nums ) {

            points.put(num,points.getOrDefault(num,0)+num);
            max=Math.max(max,num);
        }

     int twoBack=0;
     int oneBack= points.getOrDefault(1,0);

        for (int num = 2; num < nums.length ; num++) {
            int temp=oneBack;
            oneBack=Math.max(oneBack,twoBack+points.getOrDefault(num,0));
            twoBack=temp;
        }
        return oneBack;

    }

}
