package com.company;
//https://leetcode.com/problems/valid-perfect-square/submissions/
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int n =
                808201;
        System.out.println(isPerfectSquare(n));

    }
    public static boolean isPerfectSquare(int num) {
        int start =0;
        int end=num;
        //int mid = start+(end-start)/2;
        int mid;
        //int temp =num;

        while (start<=end){
             mid = start+(end-start)/2;

        if(num == mid*mid){
            return true;
        }else if(num<mid*mid){
            end = mid-1;

        }else {
            start = mid + 1;
        }
        }
        return false;

    }
}
