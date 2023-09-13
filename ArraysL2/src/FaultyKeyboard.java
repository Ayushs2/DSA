public class FaultyKeyboard {
    public static void main(String[] args) {
        String s1 = "sumeet";
        String s2 = "s ccccvumeet";
        System.out.println(faulty(s1,s2));
    }
    static boolean faulty(String name,String typed){
        int n =name.length();
        int m = typed.length();
        int i=0,j=0;
        if(n>m){
            return false;
        }
        while (i<n&&j<m){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if (i>0 && name.charAt(i-1)==typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        while (j<m){
            if(name.charAt(i-1)!=typed.charAt(j)){
                return false;
            }
            else{
                j++;
            }
        }
        return i<name.length() ? false: true;

    }
}
