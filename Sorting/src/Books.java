import java.util.Scanner;

public class Books {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int ans = book(arr,t);
        System.out.print(ans);
    }
    static int sum = 0;
    static int book(int arr[],int t){
        int n =arr.length;
        int mcx =0;
        int c = 0;
        for(int j =0;j<n;j++){
            if(arr[j]<=t&&sum<=t){
                if(sum>t){
                    c--;
                }

                sum+=arr[j];
                c++;
            }
            else{
                --j;
                c=0;
                mcx=0;
                sum = 0;
            }

            if(c>mcx)
                mcx = c;
        }
        return mcx;
    }
}
