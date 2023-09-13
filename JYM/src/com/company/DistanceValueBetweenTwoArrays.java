package com.company;

import java.util.Arrays;

public class DistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 ={1,4,2,3};
        int[] arr2 = {-4,-3,6,10,20,30};
        int d = 3;
        int ans=findTheDistanceValue(arr1,arr2,d);
        System.out.println(ans);

    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        //Arrays.sort(arr1);
        int count = 1;
        //int mod = 1;
        for(int i=0; i<arr1.length-1;i++){
            for(int j=0; j<arr2.length-1; j++){
                int mod =Math.abs(arr1[i]-arr2[j]);

                if(mod<=d )
                    count++;
            }

        }
            return count;
    }
}
