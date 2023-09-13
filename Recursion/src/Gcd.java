public class Gcd {
    public static void main(String[] args) {
        int a=35;
        int b= 10;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b){
        if(a==0)
            return b;
        else

            return gcd(b%a, a);
    }
}
