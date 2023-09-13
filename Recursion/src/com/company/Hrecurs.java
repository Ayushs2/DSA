package com.company;

import java.util.Scanner;

public class Hrecurs {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       while (t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();


            }
            int ans =sum(arr,n-1);
            System.out.println(ans);
        }
       }

    static int sum(int arr[], int ind){
        if(ind<0)
            return 0;
        return arr[ind]+sum(arr,ind-1);
    }
}
