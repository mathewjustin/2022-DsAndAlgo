package dp;

import java.util.HashMap;

/**
 * @author Justin Mathew
 */
public class DeleteAndEarn {
    public static void main(String[] args) {
        int number[]=new int[]{2,2,3,3,3,4};
        deleteAndEarn(number);
    }



    private static HashMap<Integer, Integer> points = new HashMap<>();
    private static HashMap<Integer, Integer> cache = new HashMap<>();

    private static int maxPoints(int num) {


        if(num==0)
        {
            return 0;
        }
        if(num==1)
        {
            return points.getOrDefault(num,0);
        }

        if(cache.containsKey(num))
        {
            cache.get(num);
        }
        int gain=points.getOrDefault(num,0);
        cache.put(num, Math.max(maxPoints(num-1),maxPoints(num-2 )+ gain));
        return cache.get(num);
    }

    public static int deleteAndEarn(int[] nums) {

        int max=0;
        for (int num: nums ) {

            points.put(num,points.getOrDefault(num,0)+num);
            max=Math.max(max,num);
        }
        return maxPoints(max);

    }

}


