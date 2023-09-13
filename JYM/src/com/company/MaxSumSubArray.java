package com.company;

import java.util.Scanner;

public class MaxSumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        if (k<n && k>=1){
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
                if (array[i]<-10000||array[i]>10000){
                    return;
                }
            }
            int temp;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] < array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(array[i]);
            }
            for (int i = 0; i < k; i++) {
                sum = sum + array[i];
            }
            System.out.println(sum);

        }else
        return;
        {

        }
    }
}
