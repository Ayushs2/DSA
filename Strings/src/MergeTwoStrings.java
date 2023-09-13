import java.util.Scanner;

public class MergeTwoStrings {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2= sc.nextLine();
        String ans = merge(s1,s2);
        System.out.print(ans);
    }
    static String merge(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int s=0;
        String ns = "";
        while(n>s && m>s){
            ns = ns + s1.charAt(s);
//            ns = ns+ s2.charAt(s);
            s++;
          }
        if(s>=n){
            for(int i =s;i<m;i++){
                ns = ns+s2.charAt(i);
            }
        }
        if(s>=m){
            for(int i =s;i<n;i++){
                ns = ns+s1.charAt(i);
            }
        }
        return ns;
    }
}
