import java.util.ArrayList;

public class KeyPadCombination {
    public static void main(String[] args) {
      //  System.out.println(keyPad("678"));
        keypad("678","");

    }
    static String[] codes= {" ","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> keyPad(String s){
        if(s.isEmpty()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = s.charAt(0);
        ArrayList<String> recResult = keyPad(s.substring(1));
        String codeIndex = codes[ch-'0'];
        ArrayList<String> myRes = new ArrayList<>();
        for (int i = 0; i < codeIndex.length(); i++) {
            char c= codeIndex.charAt(i);
          for (String ss:recResult){
              myRes.add(c+ss);
          }
        }
        return myRes;
    }
    public static void keypad(String up,String p){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        String index = codes[ch-'0'];
//        String rec = up.substring(1);
        for (int i=0;i<index.length();i++){
            char c = index.charAt(i);
            keypad(up.substring(1),p+c);
        }
    }
}
