package com.company;

public class SubSeqWithASSCI {
    public static void main(String[] args) {
        subSeqASSCI("abc", "");
    }

    public static void subSeqASSCI(String up, String p) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqASSCI(up.substring(1), p);
        subSeqASSCI(up.substring(1), p + ch);
        subSeqASSCI(up.substring(1), p + (ch + 0));
    }
}
