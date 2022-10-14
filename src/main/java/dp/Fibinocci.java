package dp;

import java.util.HashMap;

public class Fibinocci {

    static HashMap<Integer,Integer>memory=new HashMap<>();


    public static int fib(int n){


        if(n==1)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }

        if(memory.get(n)==null)
        {
           int calculated= fib(n-1)+fib(n-2);
           memory.put(n,calculated);
           return memory.get(n);

        }else{
            return memory.get(n);
        }

    }


    public static void main(String[] args) {

        System.out.println(fib(3029));

    }
}
