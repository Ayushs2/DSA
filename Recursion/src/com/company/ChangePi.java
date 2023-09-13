package com.company;

import java.util.Scanner;

public class ChangePi {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String s = sc.next();
        String p = "";
        rep(p,s);
//        System.out.print(ans);
    }
    static void rep(String p,String up){
        if(up.isEmpty()){
            return ;
        }
        String pi = "3.14";
        if(up.startsWith("pi")){
             rep(p+pi,up.substring(2));
        }
        else{
            rep(p+up.charAt(0),up.substring(1));
        }
        System.out.print(p);
    }
}
