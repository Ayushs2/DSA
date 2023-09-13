package com.company;

public class MaxInArray {
    public static void main(String[] args) {
        int arr[] = {20,10,40,60,0,50};
        System.out.println(printmax(arr,0,Integer.MIN_VALUE));
        System.out.println(max(arr,0));
    }

    static int printmax(int arr[],int idx,int max){
        if (idx==arr.length){
            return max;
        }
        int value = arr[idx];
     max = Math.max(max,value);
       return printmax(arr,idx+1,max);
    }
    static int max(int arr[],int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int mism =max(arr,idx+1);
            if(mism>arr[idx]){
                return mism;
            }
            else
                return arr[idx];
        }
    }

