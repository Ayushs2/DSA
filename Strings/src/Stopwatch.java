import java.util.Scanner;

public class Stopwatch {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        int ans =0;
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(n%2!=0)
            System.out.println("still running");
        else if (n<3)
            System.out.println(arr[n - 1] - arr[n - 2]);
        else{
            for(int j= 0;j<n-2;j++){
                sum+=arr[j];}
            if(sum>arr[n-1]){
                ans = sum-arr[n-1];
                System.out.println(ans);}
            else{
                ans = arr[n-1]-sum;
                System.out.println(ans);
            }
        }
    }
}
