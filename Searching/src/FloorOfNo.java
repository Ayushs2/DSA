import java.util.Scanner;

public class FloorOfNo {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,8, 10, 11, 12, 19};

        int n = args.length;
        int x = 9;
        int ans = floor(arr,x);
        System.out.print(ans);
    }

    static int floor(int arr[],int x){
        int n = arr.length;
        int s=0;
        int e =n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>x)
                e =mid-1;
            else if(arr[mid]<x){
                s=mid+1;
            }
            else if(arr[mid]==x){
                return mid;
            }
             if(mid<0 ){
                return -1;
            }



        }
        return e;
    }
    }

