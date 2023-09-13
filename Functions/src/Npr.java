import java.util.Scanner;
//benefit of functions is modularity
public class Npr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = 1;
        for(int i=1;i<=n;i++){
            nfact  = nfact*i;
        }
        int nrfact = 1;
        for (int i = 1; i <= n-r; i++) {
            nrfact = nrfact*i;
        }

        int ans = nfact/(nrfact);
        System.out.println("nPr Without Function"+ans);
        int ans2 = fact(n)/fact(n-r);
        System.out.println("nPr calculated with function"+ans2);
    }
    static int fact(int n){
        int fact =1;
      for(int i=1;i<=n;i++){
          fact*=i;
      }
      return fact;
    }

}
