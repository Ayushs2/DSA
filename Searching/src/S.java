import javax.management.Attribute;
import java.util.HashMap;
import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getNumOfTurn(s,1,2));
    }
   public static String solutio(String chars){
        int n = chars.length();
        int count =1;
        String temp = "";
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(chars.charAt(i)==chars.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                temp+=chars.charAt(i)+""+count;
            }
            count =1;
        }
        return temp;
    }
    static String solution(String chars) {
        HashMap<Character,Integer> hm =new HashMap<>();
        String temp = "";
        for(int i =0;i<chars.length();i++){
            char ch = chars.charAt(i);
            if(hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf= of+1;
                hm.put(ch,nf);
            }
            else{
                hm.put(ch,1);
            }
    }
            for(Character ch:hm.keySet()){
                if(hm.get(ch)>1){
                    System.out.println(ch);
                }
        }
     return  temp;
    }
    public static int getNumOfTurn(String s ,int m ,int n){
        int count =0;
        String fs = s;
        while (true){
            count++;
            if(ss(fs,m+n).equals(s)){
                return ++count;

            }
            else if(ss(fs,m).equals(s)){
                return 0;
            }
            else if(ss(fs,n).equals(s)){
                return 0;
            }
            fs = ss(fs,m+n);
            count++;
        }
    }
    public static String ss(String str,int sc){
       String result;
       result =str.substring(str.length()-sc,str.length())+str.substring(0,str.length()-sc);
       return result;
    }
}
