package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pos =0;
        double neg = 0;
        double zero = 0;
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
        int data = sc.nextInt();
        if (data<0){
            neg++;
        }
        else if (data >0){
        pos++;

        }
        else{
            zero++;
        }

    }
    double total = n;
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);
    }
}
