package com.company;

public class DispalyAnArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        print(arr,0);
    }
    static void print(int arr[],int idx){

        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);

        print(arr,idx+1);
    }
}
