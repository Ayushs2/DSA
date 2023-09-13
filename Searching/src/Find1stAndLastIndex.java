import java.util.Scanner;
//5 7 7 8 8 10
// mid1 = 2
 //s =3 e =5 mid2 = 4;
//e = 3 s =3 mid 3
public class Find1stAndLastIndex {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans2 = findEnd(arr,k);
        int ans = findStart(arr,k);
        System.out.println(ans+" "+ ans2);
    }
    static int findStart(int arr[],int k){
        int s=0;
        int e =arr.length-1;
        int sI = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>k){
                e = mid-1;
            }
            else if(arr[mid]<k){
                s = mid+1;
            }
//
            if(arr[mid] ==k && arr[mid-1]<arr[mid]){
                sI = mid;
                return sI;
            }
            if(arr[mid] ==k && arr[mid-1]==arr[mid]){
                e= mid-1;
            }
        }
       return -1;
        }
    static int findEnd(int arr[],int k){
        int s=0;
        int e =arr.length-1;
        int eI = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>k){
                e = mid-1;
            }
            else if(arr[mid]<k){
                s = mid+1;
            }
            if(arr[mid] ==k && arr[mid+1]>arr[mid]){
                eI = mid;
                return eI;
            }
            else if(arr[mid] == k && arr[mid+1]==arr[mid]){
                s = mid+1;
            }
        }
        return -1;
    }


    }

