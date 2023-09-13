import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctPairWithDifferenceK {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        count(arr,k);
    }

    static void count(int arr[], int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        int count=0;
        for(int i=0; i<n; i++){
//&& hm.containsKey(arr[i]-k)
            if(hm.containsKey(arr[i])){
                count++;
                int of = hm.get(arr[i]);
                int nf = of+1;
                hm.put(arr[i],nf);
            }
            else {
                hm.put(arr[i],1);
                if(hm.containsKey(arr[i]-k)||hm.containsKey(arr[i]+k))
                    count++;
            }
//            int a = arr[i]-k;
//            if(hm.containsKey(a)){
//                count++;
//            }
        }

        System.out.println(count);
    }
}
