package com.company;

public class FindMaxInArray {
    public static void main(String[] args) {
        int arr[] = {2,5,3,-3,45,11,0,-4,76,-33};
        System.out.println(findMax(arr,0));
    }
    static int findMax(int arr[],int idx){
       if(idx==arr.length-1){
           return arr[idx];
       }
       int rec = findMax(arr,idx+1);
       int max = Math.max(rec,arr[idx]);
       return max;


    }
}
