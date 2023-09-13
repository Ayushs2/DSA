public class XishWord {
    public static void main (String[] args) throws java.lang.Exception
    {
        String s1 = "awesome";
        String s2 = "woe";
        int ind1 = s1.length();
        int ind2 = s2.length();
        String ns = "";
        String ss =xish(s1,s2,ind1-1,ind2-1,ns);
        if (ss.equals(s2))
        System.out.println("true");
        else
            System.out.println("false");
    }

    static String xish(String s1,String s2, int ind1,int ind2, String ns )
    {
        // String ns = "";
        if(ind1<0)
            return "" ;
        if(ns.equals(s2))
            return ns;
        if(s1.charAt(ind1)==s2.charAt(ind2)&&ind2>=0)
        { ns = s2.charAt(ind2)+ns;
            ind2--;}
        return xish(s1,s2,ind1-1,ind2,ns);
    }


}
