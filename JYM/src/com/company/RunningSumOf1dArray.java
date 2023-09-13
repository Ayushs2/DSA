package com.company;
//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        int sum = 0;
        for(int elements=0;elements< nums.length;elements++){
            ans[elements]=sum+nums[elements];
            sum = ans[elements];

        } return ans;

        //Alternative code
        /*public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        // Initialize first element of result array with first element in nums.
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            result[i] = result[i - 1] + nums[i];
        }
        return result;*/

    }

}
