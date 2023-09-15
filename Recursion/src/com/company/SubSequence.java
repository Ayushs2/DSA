package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
//        ArrayList<String> st = subSeq(s);
//        for (int i = 0; i < st.size(); i++) {
//            System.out.println(st.get(i));
//        }
        subseq(s, "");
//        ArrayList<String> ans = subsequence(s,"");
//        System.out.println(ans);
//        ArrayList<String> ans =subSeq(s);
//        System.out.println(ans);
    }

    static ArrayList<String> subSeq(String s) {
        if (s.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = s.charAt(0);
        String leftch = s.substring(1);

        ArrayList<String> st = subSeq(leftch);
        ArrayList<String> myans = new ArrayList<>();
        for (String i : st) {
            myans.add("_" + i);
            myans.add(ch + i);
        }
        return myans;
    }

    public static void subseq(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(up.substring(1), p);
        subseq(up.substring(1), p + ch);
    }
    public static ArrayList<String> subsequence(String s, String ans){
        ArrayList<String> list = new ArrayList<>();
        if(s.length()==0){list.add(ans);
            return list;
        }
        char ch = s.charAt(0);
        ArrayList<String> l  = subsequence(s.substring(1),ans+ch);
        ArrayList<String> r = subsequence(s.substring(1),ans);
        list.addAll(l);
        list.addAll(r);
        return list;
    }
}
