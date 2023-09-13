import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElements2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m  = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];
        for (int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for (int i =0;i<n;i++){
            b[i] = sc.nextInt();
        }
        getcommon(a,b);

    }
    static void getcommon(int n[],int m[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int val:n){
            if (hm.containsKey(val)){
                int of = hm.get(val);
                int nf = of+1;
                hm.put(val,nf);
            }
            else {
                hm.put(val,1);
            }
        }
        for (int val: m){
            if (hm.containsKey(val) && hm.get(val)>0){
                System.out.println(val);
               int of = hm.get(val);

               int nf= of-1 ;

               hm.put(val,nf);
               // System.out.println(val);
            }
        }
    }
}
