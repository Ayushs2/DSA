import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(hFreq(s));
    }
    static Character hFreq(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
         Character ch = s.charAt(i);
         if(hm.containsKey(ch)){
             int of = hm.get(ch);
             int nf = of+1;
             hm.put(ch,nf);
         }
         else{
             hm.put(ch,1);
         }
        }
        char max = s.charAt(0);
       for(Character c : hm.keySet()){
           if(hm.get(c)>hm.get(max)){
               max = c;
           }
       }
       return max;
    }
}
