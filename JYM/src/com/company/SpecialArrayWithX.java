package com.company;
//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
import java.util.Arrays;

public class SpecialArrayWithX {
    public static void main(String[] args) {
        int arr[] = {10,2,5,3};
       boolean b= checkIfExist(arr);
        //int ans =   specialArray(arr);
        System.out.println(b);


    }


//    public static int specialArray(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        if(nums[0]>=n){
//            return n;
//        }
//        for(int i = 1 ; i<n ; i++){
//            if(nums[i]>=n-i && nums[i-1]<n-i){
//                return n-i;
//            }
//            while(i<n-1 && nums[i]==nums[i+1])    i++;
//        }
//        return -1;
//
//    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        //int a = arr[0];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==2*arr[j]  || arr[j]==2*arr[i]){
                    return true;
                }
            }

        }return false;
    }

}

