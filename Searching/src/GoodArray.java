import java.util.Scanner;

public class GoodArray {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j <n ; j++) {
                if(arr[j]>arr[i]){
                    if (arr[j]%arr[i]==0){
                        count++;
                    }
                }
            }
            if (count==n-2){
                flag =1;
            }

        }
        if (flag==1){
            System.out.println("YES");
        }
        else
            System.out.println("NO");

    }

}
