import java.util.HashMap;
import java.util.Scanner;

public class OddEven {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        countFreq(s);
    }
    // Lowercase characters: 97 to 122
    //Uppercase characters: 65 to 90
    //Digits: 48 to 57(0-9)
    static void countFreq(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        //counting frequencies of elements
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of+1;
                hm.put(ch,nf);
            }
            else{
                hm.put(ch,1);
            }
        }
        // int t =(int) 'z';
        // System.out.print(t);
        int flag =0;
        int x =0;
        int y =0;
        for(Character c : hm.keySet()){
            int n = hm.get(c);
            //System.out.print(c+ " "+ n+ " ");

            int m = c%2;
          System.out.print(c+ " "+ m+ " ");

            if(m!=0 && n%2 !=0 ){
                y++;

            }
            else if(m==0 && n%2==0){
                x++;
            }
        }
        System.out.println(x+" "+ y);
        if((x+y)%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
