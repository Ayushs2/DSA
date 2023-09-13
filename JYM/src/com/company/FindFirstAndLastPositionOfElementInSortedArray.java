package com.company;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] ar= {2,2};
        int target = 2;
        //int ans[] = {-1,-1};
       // searchRange(ar,tar);
        //System.out.println( startIndex(ar,5));
       // System.out.println(lastIndex(ar,2));
        int ans[] ={-1,-1};
        int s = startIndex(ar,target);
        int e  = lastIndex(ar, target);
        ans[0] = s;
        ans[1] = e;
       for (int i=0;i< ans.length;i++){
           System.out.print(ans[i]+" ");
       }
    }
//    public static int[] searchRange(int[] arr, int target){
//        int ans[] ={-1,-1};
//        int s = startIndex(arr,target);
//        int e  = lastIndex(arr, target);
//        ans[0] = s;
//        ans[1] = e;
//        return ans;
//    }
    public static int startIndex(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
       int  ans = -1;
        int start=0;
        int end = nums.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]>=target){
                end = mid;
                if(nums[mid]==target) {
                    ans = mid;
                }

            }
            else
                start = mid+1;
        }return ans;
    }
    public static int lastIndex(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        int  ans2 = -1;
        int start=0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]<=target){
                start = mid+1;
               if (nums[mid]==target)
                   ans2=mid;

            }
            else
                end = mid;
        }return ans2;
    }
    }
//    public static int[] searchRange(int[] nums, int target) {
//        int ans[] = {-1,-1};
//        int startIndex = binarySearch(nums,target,true);
//        int endIndex = binarySearch(nums,target,false);
//        ans[0]=startIndex;
//        ans[1]=endIndex;
//
//
//            return ans;
//
//        }
//       static int binarySearch(int[] arr,int target,boolean startIndex){
//           int sI=0;
//
//            int eI= arr.length-1;
//           int mid = sI=(eI-sI)/2;
//           int ans=-1;
//            while (sI<=eI){
//                if (arr[mid]==target){
//                    ans= mid;
//                    if (startIndex==true)
//                    eI = mid -1;
//                    else
//                        sI = mid+1;
//                }else if (arr[mid]<target){
//                    sI = mid+1;
//                }
//                else
//                    eI=mid-1;
//            }return sI;
//
//
//    }
    

