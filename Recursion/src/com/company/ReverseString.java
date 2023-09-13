package com.company;

public class ReverseString {
    public static void main(String[] args) {
        String s= "Hello";
        int n = s.length();
        System.out.println(n);
        String rev = reverse2(s);
        System.out.println(rev);

    }
    public static String reverse(String s, int index){
        if (index<0)
            return "";
        return s.charAt(index)+reverse(s,index-1);
    }
    static String reverse2(String s){
        if(s.length()<1){
            return "";
        }
        return reverse2(s.substring(1))+s.charAt(0);
    }
}
