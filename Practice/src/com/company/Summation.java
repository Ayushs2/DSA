package com.company;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long z ;
        long sum;
        long a=0;

        for(int x = 1;x<=n;x++){
            z =(x+1)*(x+1);
            sum = z-(3*x+1);
            a = sum+x+a;



        }
        System.out.println(a);
    }
}
