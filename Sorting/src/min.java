import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        min(arr);
    }
    static int tmin=Integer.MAX_VALUE;
    static int find = 0;
   static int smin = Integer.MAX_VALUE;
    static  int sind = 0;
    static void min(int arr[]){
        int fmin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<fmin){
                fmin = arr[i];
                find = i;
            }
        }


        for (int i = 1; i < arr.length ; i++) {
            if (i!=find && arr[i]<smin ){
                smin = arr[i];
                sind = i;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (i!=find && i!= sind && arr[i]<tmin){
                tmin= arr[i];
            }
        }

        int ans = tmin-fmin;
        System.out.println(ans);
    }
}
