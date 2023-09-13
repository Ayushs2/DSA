import java.util.Scanner;

public class MinElementInSortedRotated {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(min(arr,n));
    }
    static int min(int arr[],int n){
        int s=0;
        int e =n-1;
        if(arr[s]<arr[e]){
            return arr[0];
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]<arr[mid+1]&&arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid+1]<arr[mid]){
                return arr[mid+1];
            }
            if(arr[s]<arr[mid]){
                s = mid+1;
            }
            else if(arr[mid]<arr[e]){
                e= mid-1;
            }
        }
        return -1;
    }
}
