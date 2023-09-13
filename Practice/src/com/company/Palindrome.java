package com.company;

import java.util.Scanner;

public class Palindrome {
    public void pal(){
        Scanner num = new Scanner(System.in);
        int z = num.nextInt();
        int temp = z;
        int add=0;
        while(z>0){
            int r = z%10;
            add = (add*10)+r;
            z = z/10;
        }
        if (temp == add){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}
