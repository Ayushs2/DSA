package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//    SortArray sh = new SortArray();
     int arr[]={0,10,15,2};
//      sh.sortArray(arr);
        int temp = 0;
        int nm = arr[0];
        for(int i=1;i< arr.length-1;i++){
            if (arr[i]>nm){
                temp =i;
                nm = arr[i];
            }

        } System.out.println(temp);



    }
    /*static void divSum(){
        int count = 0;
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((array[i]+array[j])%k==0){
                   count++;
                }

            }
        }
        System.out.println(count);*/

    }

