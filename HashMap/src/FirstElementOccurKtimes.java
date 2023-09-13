import java.util.HashMap;
import java.util.Scanner;

public class FirstElementOccurKtimes {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k  = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = count(arr,k);
        System.out.println(ans);
    }
    static int count(int arr[], int k){
        int count = 0;
        int n =arr.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i =0; i<n ;i++){
            if(h.containsKey(arr[i])){
                int of = h.get(arr[i]);
                int nf = of+1;
                h.put(arr[i],nf);
            }
            else{
                h.put(arr[i],1);
            }
        }
        for(int x: h.keySet()){
            if(h.get(x)>=k){
                return x;
            }
        }
        return -1;
    }
}
