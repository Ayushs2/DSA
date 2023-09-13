package com.company;

public class DisplayArrInRev {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        printrev(arr,0);
    }
    static void printrev(int arr[],int idx){
        if (idx ==arr.length)
            return;
        printrev(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
