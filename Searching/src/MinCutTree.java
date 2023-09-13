import java.util.Scanner;

public class MinCutTree {
    static Scanner sc = new Scanner(System.in);
    static int n  = sc.nextInt();
    static int k = sc.nextInt();
    static int[] arr = new int[n];

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s =1;
        int e = 10;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(ismin(mid)){
                e= mid-1;
            }
            else {
                s = mid+1;

            }
        }
        if(ismin(e)){
            System.out.println(e);
        }
        else {
            System.out.println(s);
        }
    }

    static boolean ismin(int h){
        int wood =0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=h){
                wood+=arr[i]-h;
            }
        }
        if(wood<=k){
            return true;
        }
        else
            return false;
    }

}
