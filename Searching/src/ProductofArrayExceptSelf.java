import java.util.Scanner;

public class ProductofArrayExceptSelf {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long[] ans = prod(arr);
        for (long i: ans) {
            System.out.print(i+" ");
        }


    }
    static  long[] prod(long arr[]){
        int n = arr.length;
        int flag = 0;
        long prodt = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0)
                flag++;
            else
                prodt*=arr[i];
        }
        long ans[] = new long[n];
        for (int i = 0;i < n; i++) {
            if (flag>0)
                ans[i] = 0;
            else
              ans[i] = (prodt/arr[i]) ;
        }
        return ans;
    }
}
