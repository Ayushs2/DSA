public class Greetings2 {
    public static void main (String[] args) throws java.lang.Exception
    {
        String s = "heey";
        int n = s.length();
        //int c = hey(s,n-1);
        int ct=0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i)=='e')
                ct++;

        }
        String str = "";
        for (int i = 0; i < 2*ct; i++) {
           str = str+'e';

        }
        System.out.println("h"+str+"y");
    }
//    static int count=0;
//    static int hey(String s, int ind){
//        //String newstr = "";
//        if(ind <0)
//            return count;
//        if(s.charAt(ind)=='e')
//        {  count++;
//            }
//      hey(s,ind-1);
//        return count;
//    }
}
