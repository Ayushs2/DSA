package com.company;

public class Toh {
    public static void main(String[] args) {
        int n  = 2;
        toh2(n,"T1","T2","T3");

    }
    static void toh(int n , String t1, String t2, String t3){
        //t1->src
        //t2-> helper
        //t3-> Destination
        if(n==0)
            return;
        toh(n-1,t1,t3,t2);
        System.out.println(n+" -> "+t1+" -> "+t3);
        toh(n-1,t2,t1,t3);
    }
    static void toh2(int n ,String t1,String t2 ,String t3){
        if(n==0)
            return;
        toh2(n-1, t1,t3,t2);
        System.out.println(n +" ->"+t1+"->" +t2);
        toh2(n-1,t3,t2,t1);
    }
}
