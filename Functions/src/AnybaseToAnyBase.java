import java.util.Scanner;

public class AnybaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int baseOfN = sc.nextInt();
        int toBase = sc.nextInt();
        int todecimal = AnyBaseToDecimall.anyBaseToDecimal(n,baseOfN);
        int toAnotherBase =  DecimalToAnyBase.decimalToAnyBase(todecimal,toBase);
        System.out.println(toAnotherBase);
    }
}
