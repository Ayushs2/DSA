package com.company;

public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,10};
        System.out.println(check(arr,0));
    }
    static boolean check(int arr[], int n){
        if(n==arr.length-1)
            return true;
        if(arr[n]<arr[n+1]){
           return check(arr,n+1);
        }
          return false;
    }
}
