package com.company;
//searching an element in a sorted list or array
//Binary Search is efficient than Linear Search
// algorithm and performs the search operation
// in logarithmic time complexity for sorted arrays or lists.
//https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6} ;
        int n =binarySearch(arr,2);
        System.out.println(n);

    }
    //Iterative Function
  static int binarySearch(int[] nums ,int target){
        int start=0;int mid ;int end= nums.length-1;
        while (start<=end){
           mid = (start+end)/2;
           if (nums[mid]==target){
               return mid;

            }if (nums[mid]<target){
               start=mid+1;

           }else
               end=mid-1;
        }start= start+1;
      System.out.print(nums[start]+" Index is: ");
        return start;



    }
//    //Recursive Function
//    static int binarySearch(int[] nums ,int start, int end,int target) {
//        if(start > end)
//            return -1;
//          int mid = start+(end-start)/2;
//
//            if (nums[mid]==target){
//                return mid;
//            }
//            else if (nums[mid]>target){
//               return binarySearch(nums,start,mid-1,target);
//            }else
//               return binarySearch(nums, mid+1,end, target);
//
//        }

}


