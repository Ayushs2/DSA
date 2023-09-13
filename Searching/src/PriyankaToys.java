import java.util.Arrays;
import java.util.Scanner;

public class PriyankaToys {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = toys(arr);
        System.out.println(ans);
    }
    static int toys(int arr[]){
        Arrays.sort(arr);
        int n =arr.length;
        int count = 1;
        for(int i =0;i<n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+4>=arr[j]){
                    continue;
                }
                else
                    count ++;
                i=j-1;

                break;
            }
        }
        return count;
    }
}
