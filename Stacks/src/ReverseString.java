import java.util.*;
import java.lang.*;
import java.io.*;
public class ReverseString
{
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc= new Scanner(System.in);
            String s = sc.next();

            System.out.print(rev(s));
        }
        static String rev(String s){
            String ans="";
            Stack<Character> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                st.push(ch);
                char c = st.peek();
                ans = c+ans;
                st.pop();
            }
            // for(int i=0;i<s.length();i++){
            //   char c = st.peek();
            //   ans = ans+c;
            //   st.pop();
            // }
            return ans;
        }
    }

