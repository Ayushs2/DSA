import java.util.Scanner;
//b = base of given no
public class AnyBaseToDecimall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(anyBaseToDecimal(n,b));
    }
    public static int anyBaseToDecimal(int n, int b){
        int rv= 0;
        int p =1;
        while(n>0){
            int dig = n%10;
            n= n/10;
            rv+=dig*p;
            p = p*b;
        }return rv;
    }
}
