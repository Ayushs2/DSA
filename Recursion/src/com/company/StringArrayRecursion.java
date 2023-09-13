package com.company;

import java.util.HashMap;
import java.util.HashSet;

//fuction that takes this string array and merge to a single string
public class StringArrayRecursion {
    public static void main(String[] args) {
        String str[] = {"Hello","World","accio"};//HelloWorldaccio
        int n = str.length;
       // System.out.println(n);
        String m =merge(str, n-1);
        System.out.println(m);
    }
    static String merge(String s[],int index){
        if (index<0)
            return "";

     return  merge(s,index-1)+" "+s[index];
    }
}
// "" + "hello"
// "hello" + "world"
// "helloworld" + "accio"
// "helloworldaccio"
// main()
