package com.company;


import java.util.Scanner;

public class PermutationArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
            }
        permu(arr);


    }

    public static int[] permu(int[] nums) {
        //Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return nums;


    }

}








