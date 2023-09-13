package com.company;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
    static int fact(int n){
        if( n<=1){
            return 1;
        }
        int ans = fact(n-1);
        int finalans = ans*n;
        return finalans;
    }
}
