package com.company;
//https://leetcode.com/problems/sqrtx/
public class Sqrt {
    public static void main(String[] args) {
        int n =
                5;
        System.out.println(sqrt(n));

    }

    static int sqrt(int x) {
        long start = 0;
        long end = x;
        //int mid = start+(end-start)/2;
        long mid;
        int ans=0;
        //int temp =num;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (x == mid * mid) {
                return (int)mid;
            } else if (x < mid * mid) {
                end = mid - 1;
                ans =(int) end;

            } else {
                start = mid + 1;
            }
        }
        return ans ;
    }
}
