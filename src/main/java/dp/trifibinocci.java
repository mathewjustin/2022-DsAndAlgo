package dp;

import java.util.HashMap;

public class trifibinocci {

    static HashMap<Integer,Integer> memory=new HashMap<>();


    public static int tribonacci(int n) {

        if(n<1)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(memory.get(n)==null)
        {
            int calculated= tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
            memory.put(n,calculated);
            return memory.get(n);

        }else{
            return memory.get(n);
        }

    }

    public static void main(String[] args) {

        System.out.println(tribonacci(25));

    }

}
