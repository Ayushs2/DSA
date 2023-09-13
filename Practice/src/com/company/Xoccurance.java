package com.company;

import java.util.Scanner;

public class Xoccurance {
    public static void main(String[] args) {
        int n = 5;
        int x=5;
        System.out.println(count(n,x));
    }
    static int count( int n,int x){
        int[][] arr = new int[n+1][n+1];//
        int count =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                arr[i][j] =i*j;
                if(arr[i][j]==x){
                    count++;
                }
            }
        }return count;
    }

}
