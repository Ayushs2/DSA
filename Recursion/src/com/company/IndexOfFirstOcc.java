package com.company;
import java.util.Arrays;
public class IndexOfFirstOcc {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4, 6, 3, 7, 3, 5};
        int k = 5;
        System.out.println(first(arr,0,k));
    }

    static int first(int arr[], int idx, int tar) {
        if (idx == arr.length-1) {
            return -1;
        }
        if(arr[idx]==tar){
            return idx;
        }
        else
            return first(arr,idx+1,tar);
    }
}
