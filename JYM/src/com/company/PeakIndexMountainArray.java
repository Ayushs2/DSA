package com.company;

import java.util.ArrayList;
import java.util.List;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int arr[]={0,10,15,16,12,18,3,33,0};
        peakIndexInMountainArray(arr);

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int l = 0, r = n - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }else if(arr[mid] < arr[mid + 1]){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return -1;
//    public static int peakIndexInMountainArray(int[] arr) {
//        int temp = 0;
//        int nm = arr[0];
//        for(int i=1;i< arr.length-1;i++){
//            if (arr[i]>nm){
//                temp =i;
//                nm = arr[i];
//            }
//
//        }return temp;
    }

}

//    public int peakIndexInMountainArray(int[] arr) {
//        int n = arr.length;
//        int l = 0, r = n - 1;
//
//        while(l <= r) {
//            int mid = l + (r - l) / 2;
//            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
//                return mid;
//            }else if(arr[mid] < arr[mid + 1]){
//                l = mid + 1;
//            }else {
//                r = mid;
//            }
//        }
//        return -1;
