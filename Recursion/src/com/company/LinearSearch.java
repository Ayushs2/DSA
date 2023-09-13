package com.company;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {3,5,6,2,7,8,4,1};
        int t = 1;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(linearSearch(arr,t,0));
    }
//    static ArrayList<Integer> search(int arr[], int t,int n,  ArrayList<Integer> list){
//        if(n==arr.length)
//            return list;
//        if(arr[n] ==t){
//            list.add(arr[n]);
//        }
//            return search(arr,t,n+1,list);
//
//    }
    static int linearSearch(int arr[],int t,int n){
        if(n==arr.length)
            return -1;
        if (arr[n]==t){
            return n;
        }
        else
            return linearSearch(arr,t,n+1);
    }
}
