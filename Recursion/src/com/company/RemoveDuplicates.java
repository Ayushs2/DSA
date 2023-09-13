package com.company;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        //int n =sc.nextInt();
        String s = sc.nextLine();
      //  String s2 = "";
//        String ans = duplicate(s2,s);
//        while(ans.length()!=s2.length()){
//            String temp ="";
//            s2 = ans;
//            ans = duplicate(temp,s2);
//
//        }
//        String ans = rDup(s);
//        while (ans.length()!=s2.length()){
//            s2 = ans;
//            ans = rDup(s2);
//        }
//        System.out.print(ans);
        String p ="";
        System.out.println(dup(s,p));
    }
    static String dup(String s,String p){


        if(s.length()<2){
            return s+p;
        }
        if(s.length()>1 && s.charAt(0)==s.charAt(1)){
          return dup(s.substring(2),p);


        }
        else{
            p+=s.charAt(0);
            return dup(s.substring(1),p);

        }
    }

//    static String duplicate(String p,String up){
//
//
//        if(p.length()>2 &&p.charAt(0)==p.charAt(1)){
//            return duplicate(p.substring(2),up);
//        }
//        if(up.length()<2){
//            return p+up;
//        }
//        if(up.charAt(0)==up.charAt(1)){
//            return duplicate(p,up.substring(2));
//        }
//        else{
//            char ch = up.charAt(0);
//            return duplicate(p + ch, up.substring(1));
//
//        }
//    }  //abbbaca
    static String rDup(String s){
        int n  = s.length();
        String ns = "";
        int k =0;
        while(k<n){
            if(k<n-1&&s.charAt(k)==s.charAt(k+1)){
              while (k<n-1 && s.charAt(k)==s.charAt(k+1) ) {
                 ++k;
              }k++;
            }
            else {
                ns = ns+s.charAt(k);
                k++;
            }
        }
        return ns;
    }
//    static String duplicate(String p,String up){
//
//
//        if(p.length()>2 &&p.charAt(0)==p.charAt(1)){
//            return duplicate(p.substring(2),up);
//        }
//        if(up.length()<2){
//            return p+up;
//        }
//        if(up.charAt(0)==up.charAt(1)){
//            return duplicate(p,up.substring(2));
//        }
//        else{
//            char ch = up.charAt(0);
//            return duplicate(p + ch, up.substring(1));
//        }
//    }
}
