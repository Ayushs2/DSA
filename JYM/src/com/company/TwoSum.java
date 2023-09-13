package com.company;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[nums.length];
        int i = 0;
        int sum = nums[i];
        //int j=0;
            for ( i=0;i< nums.length;i++){

                for(int j=i+1;j<nums.length;j++){

                    if (nums[i]+nums[j]==target){
                        int[] aa = {i,j};
                        result = aa;
                    }
                }
            }return result;
    }
}
