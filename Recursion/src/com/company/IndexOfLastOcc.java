package com.company;

public class IndexOfLastOcc {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4, 6, 3, 7, 3, 5};
        int k = 5;
        System.out.println(last(arr,0,k));
    }
    static int last(int arr[],int idx,int tar){
        if(idx ==arr.length){
            return -1;
        }
       int LatIndexFoundOrNot= last(arr,idx+1,tar);
        if(LatIndexFoundOrNot==-1){
            if (arr[idx]==tar){
                return idx;
            }
            else return -1;
        }
        else
            return LatIndexFoundOrNot;
    }
}
