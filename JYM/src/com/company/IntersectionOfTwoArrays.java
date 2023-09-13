package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {1};
        intersect(arr1, arr2);


    }
    public static int[] intersect(int[] nums1, int[] nums2) {
       // Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr ;
        int k=0;
        int a=0;
        for (int i=0;i< nums1.length;i++) {
            int tar = nums1[i];
             a = binarySearch(nums2,tar);
            if (a==tar) {
              list.add(k,a);
              k++;
            }

        }

        arr= list.stream().mapToInt(i -> i).toArray();

        return arr;
    }
       public static int binarySearch(int[] arr ,int target){
            int st=0;
            int end = arr.length-1;
            int ans=0;
                while(st<=end){
                    int mid = st+(end-st)/2;
                    if(arr[mid]==target) {
                      ans = target;
                      return ans;
                    }
                    else if(arr[mid]<target){
                        st=mid+1;
                    }
                    else
                        end=mid-1;

                }return ans;
            }
}




