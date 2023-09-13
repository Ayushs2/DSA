package com.company;

import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        int[] newArray = new int[n];
        for(int i =0;i<n;i++){
            array[i] = sc.nextInt();
        }
            for(int i =0;i<n;i++){
                int newIndex = (i+k)%n;
                newArray[newIndex] = array[i];


            }
            for (int i=0;i<q;i++){
                int index = sc.nextInt();
                System.out.println(newArray[index]);

        }







        }


    }

