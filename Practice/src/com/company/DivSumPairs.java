package com.company;

import java.util.Scanner;

public class DivSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k  = sc.nextInt();
        int[] array = new int[n];
        for(int i =0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int count = 1;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(k>0 && array[i]<array[j] && (array[i]+array[j])%k==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
