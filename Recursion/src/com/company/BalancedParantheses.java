package com.company;

public class BalancedParantheses {
    public static void main(String[] args) {
        BP(3,0,0,"");
    }
    static void BP(int n, int o, int c ,String s ){
        if(o==n && c==n){
            System.out.println(s);
            return;
        }
        if(o<n){
            BP(n,o+1,c, s+"(");
        }
        if(c<o){
            BP(n,o,c+1, s+")");
        }
    }
}

