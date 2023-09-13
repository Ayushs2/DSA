package com.company;

public class FindAllidxOfTar {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,4,5,3,4,6,7};
        int k =4;
        int ans[] = find(arr,0,k,0) ;
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    static int[] find(int arr[],int idx,int tar,int CountTarIdx){
        if(idx ==arr.length){
            return new int[CountTarIdx];

        }
        if (arr[idx] == tar) { //counting the no of target values and creating array of that size
           int a[] = find(arr,idx+1,tar,CountTarIdx+1);
           a[CountTarIdx]=idx;
           return a;

        }
       else{
           int a[]= find(arr,idx+1,tar,CountTarIdx);
           return a;
        }

    }
}
