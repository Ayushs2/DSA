import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fibbonaciMemoised(n,new int[n+1]);
        System.out.println(ans);

    }
    static int  fibbonaciMemoised(int n ,int[] quesBank){
        if (n==0||n==1){
            return n;
        }
        if(quesBank[n]!=0){
            return quesBank[n];
        }
        int fib1 = fibbonaciMemoised(n-1,quesBank);
        int fib2 = fibbonaciMemoised(n-2,quesBank);
        int fib = fib1+fib2;
        quesBank[n] = fib;
        return fib;
    }
}
