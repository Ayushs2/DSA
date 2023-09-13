package com.company;

import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        int k = sc.nextInt();
        //int  p = k*sum(148);

        int x = superDigit(n,k);
        if (x<10){
            System.out.println(x);
        }
        else
            System.out.println(superDigit(x,k));


    }
    static int sum(int n){
        if(n==0)
            return 0;
        return n%10+sum(n/10);
    }
    static int superDigit(int p,int k){
         p = k*sum(148);
        if(p<10)
            return p;

        return sum(p);

    }

//    static int superDigit(String s,int ind){
//        if(ind<0)
//            return 0;
//        System.out.println(s.charAt(ind));
//        int g= superDigit(s,ind-1);
//        int ans=s.charAt(ind)+g;
//        return ans;
//
//
//    }
}
