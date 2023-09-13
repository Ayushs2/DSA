package com.company;

public class ArraySum {

    public static void main(String[] args) {
        int[] array = {2,3,4,5};
        int n = array.length-1;
        //sum(array,n);
        System.out.println(sum(array,n));
    }
    static int sum(int[] arr,int index){
        if(index<0)
        return 0;

        return arr[index]+sum(arr,index-1);
    }
}
