import java.util.Scanner;

public class DigitFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("The no of "+k+"'s are "+getDigitFreq(n,k));
    }
    static int getDigitFreq(int n,int k ){
        int temp = n;
        int count = 0;
        while(temp!=0){
            int a = temp%10;
            if(a==k){
                count++;
            }
            temp = temp/10;
        }
        return count;
    }
}
