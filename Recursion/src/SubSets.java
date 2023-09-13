import java.util.ArrayList;

public class SubSets {
    public static void main(String[] args) {
        System.out.println(subset("abc"));
    }
//    public static void subsets(String s,String p){
//    if (s.isEmpty()){
//        System.out.println(p);
//        return;
//    }
//    char ch = s.charAt(0);
//        subsets(s.substring(1),p);
//        subsets(s.substring(1),p+ch);
//
//
//    }
//    public static ArrayList<String> subsets(String s, String p){
//        if (s.isEmpty()){
//            ArrayList<String> base = new ArrayList<>();
//            base.add(p);
//            return base;
//
//        }
//        char ch = s.charAt(0);
//        ArrayList<String> left = subsets(s.substring(1),p);
//        ArrayList<String> right =  subsets(s.substring(1),p+ch);
//       ArrayList<String> st = new ArrayList<>();
//        for(String k:left){
//          st.add(k);
//        }
//        for (String l: right){
//            st.add(l);
//        }
////        left.addAll(right);
////        return left;
//        return st;
//    }
    public static ArrayList<String> subset(String s){
        if(s.isEmpty()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = s.charAt(0);
        ArrayList<String> recResult = subset(s.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        for(String res :recResult){
            ans.add(""+res);
        }
        for(String res :recResult){
            ans.add(ch+res);

        }
        return ans;
    }

}
