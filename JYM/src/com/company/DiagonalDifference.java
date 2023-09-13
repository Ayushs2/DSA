package com.company;

public class DiagonalDifference {
    public static void main(String[] args) {
        int ar[][] ={{1,2,3},{4,5,6},{9,8,9}};
        System.out.println(difference(ar));

    }

    static int difference(int arr[][]) {
    int diff=0;
    int sum1 = 0;
    int sum2 = 0;
        for(int i = 0; i<arr.length;i++)
    {
        for (int j = 0; j < arr.length; j++) {
            if (i == j) {
                sum1 =sum1+ arr[i][j] ;
            }
        }
    }
        for(int i = 0; i< arr.length;i++)

    {
        for (int j = arr.length; j >= 0; j--) {
            if (i + j== arr.length-1) {
                sum2 = sum2+arr[i][j];
            }
        }
    }
        diff = sum1-sum2;
        if (diff<0){
            diff = (diff)*(-1);
        }
        return diff;
}
}
