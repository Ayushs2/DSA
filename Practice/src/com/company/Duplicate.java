package com.company;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int[] array = new int[z];
        int count = 1;
        for(int i =0;i<z;i++){
            array[i] = sc.nextInt();
        }
        for(int i =0;i<z;i++){
            for(int j =i+1;j<z;j++){
                if(array[i] == array[j] ){
                    count++;

                }
            }
        }
        if(count>=2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
