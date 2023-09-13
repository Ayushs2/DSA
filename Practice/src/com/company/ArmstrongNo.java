package com.company;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0,temp,z;
        temp = n;
        while (temp!=0){
            z = temp%10;
            sum = sum+z*z*z;
            temp = temp/10;

        }
        if(sum==n){
            System.out.println("1");

        }
        else{
            System.out.println("0");
    }
    }
}
