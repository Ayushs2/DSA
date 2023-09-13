package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner sc = new Scanner(System.in);
        System.out.print("enter number"+" ");
        int n = sc.nextInt();
        int New_Sum = 0;
        for (int i = 0; i <= n; i++) {
            New_Sum=New_Sum+i;
        }

        System.out.println(New_Sum);
    }
}

