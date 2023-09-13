package com.company;

public class TimeComplexityRecursion {
    public static void main(String[] args) {
        String s = "hello";
        String s2= "ho";
        int n  = s.length();
        System.out.println(n);
        System.out.println( xish(s,s2,n-1));
    }
    static boolean xish(String s,String s2,int ind ){
        int count =0;
        if(ind<0)
            return false ;
        for(int i=0;i<s2.length();i++){
            if(s.charAt(ind)==s2.charAt(i))
            { count++;
                //ind = s.length()-1;
           }
            else
                xish(s,s2,ind-1);
        }
        if(count==s2.length())
            return true;

        else{
        return false;}
    }
}






//    static int rev =0;
//  static void reverse(int n){
//        int rem =0;
//        if (n==0)
//            return ;
//        else
//            rem = n%10;
//        rev = rev*10+rem;
//      System.out.println(rev);
//         reverse(n/10);

//      int t=0;
//     if(n<10)
//         return n;
//     else
//         t= n%10;
//      System.out.print(t);
//         return reverse(n/10);






