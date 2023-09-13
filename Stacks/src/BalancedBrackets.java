import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(bal(s));
        // System.out.print(lsubString(s));
    }
    static int lsubString(String s){

        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            if(ch==')'){
                if(st.size()==0){
                    return 0;
                }
                if(st.peek()=='('){
                    st.pop();
                }
                else if( st.peek()!='('){
                    return 0;
                }
            }
            if(ch==']'){
                if(st.size()==0){
                    return 0;
                }
                else if( st.peek()=='['){
                    st.pop();
                }
                else if( st.peek()!='['){
                    return 0;
                }
            }
            if(ch=='}'){
                if(st.size()==0){
                    return 0;
                }
                else if( st.peek()=='{'){
                    st.pop();
                }
                else if(st.peek()!='{'){
                    return 0;
                }
            }
        }
        if(st.size()==0){
            return 1;
        }
        else return 0;
    }
    static boolean bal(String s){
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if (c =='(')
              st.push(')');
            else if(c=='{')
                st.push('}');
            else if(c=='[')
                st.push(']');
            else if(st.isEmpty()||st.pop()!=c)
                return false;
        }
        return st.isEmpty();
    }
}
