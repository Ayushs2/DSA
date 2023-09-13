package com.company;

public class RemoveVowelsRecursion {
    public static void main(String[] args) {
        String s[] = {"hello","ayush","singh"};//Output Should be 'hllysh'
        int n =s.length;
        String m =merge(s,n-1);
        System.out.println(m);

    }
    static String merge(String[] str, int index){
        //Base Condition
        if (index<0)//i.e if index reaches to -1 return
            return "";
        String t ="";
        for (int i=0;i<str[index].length();i++){
            if(str[index].charAt(i)=='a'||str[index].charAt(i)=='e'||str[index].charAt(i)=='i'||
                    str[index].charAt(i)=='o'||str[index].charAt(i)=='u'){
            continue;
            }
            else
             //as we cannot delete or add elements to string so what we do is create a new String
            t= t+str[index].charAt(i);
        }
        return merge(str,index-1)+" "+t;
    }
}
