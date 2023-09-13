import java.util.Scanner;

public class Xoccurance {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int x = sc.nextInt();
        System.out.println(count(n,x));

    }
    static int count( int n,int x){
        int[][] arr = new int[n+1][n+1];
        int count =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                arr[i][j] =i*j;
                if(arr[i][j]==x){
                    count++;
                }
            }
        }return count;
    }
}
