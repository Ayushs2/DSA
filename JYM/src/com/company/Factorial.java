package com.company;

public class Factorial {
    public static void main(String[] args) {
        int gcd = 1;
        int a=4;
        int b = 3;
        int a1 = fact(a);
        int b1 = fact(b);
        for(int i=1;i<=a1&&i<=b1;i++)
        {
            if(a1%i==0&&b1%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);

    }
    public static int fact(int n){
        //int f = 1;
        if(n==1){
            return 1;
        }
        int ans = n*fact(n-1);
        return ans;
    }

}
