import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(decimalToAnyBase(n,b));
    }
    public static int decimalToAnyBase(int n,int b){
        int rv =0;
        int p =1;
        while(n>0){
            int dig = n%b;
            n=n/b;
            rv+= dig*p;
            p = p*10;
        }
        return rv;
    }
}
