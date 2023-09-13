package com.company;

import java.util.ArrayList;

import static com.company.TwoSum.twoSum;

public class TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,9,12,16};
        int tar = 17;

       ArrayList<Integer> a= twoSum(arr,tar);
        System.out.println(a);
//       for (int i : a)
//        System.out.println(i);


    }
    public  static ArrayList<Integer> twoSum(int[] numbers, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(numbers==null || numbers.length==0) {
            list.add(-1);
            list.add(-1);
            return list;
        }
        int low =0,high=numbers.length-1;
        while(low<high){
            int sum=numbers[high]+numbers[low];
            if(sum==target){
              list.add(low);
              list.add(high);
              return list;
            }

            if(target<sum)high--;
            else if(target>sum)low++;
        }
        return list;

    }
//    public int[] twoSum(int[] numbers, int target) {
//        int aPointer = 0;
//        int bPointer = numbers.length - 1;
//
//        while(aPointer < bPointer) {
//            int sum = numbers[aPointer] + numbers[bPointer];
//
//            if(sum < target) {
//                aPointer += 1;
//            } else if(sum > target) {
//                bPointer -= 1;
//            } else {
//                return new int[] {aPointer + 1, bPointer + 1};
//            }
//        }
//
//        return new int[] {aPointer + 1, bPointer + 1};
//    }

    }

