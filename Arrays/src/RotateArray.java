public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k =2;
        rotate(arr,k);


    }
    public static void rotate(int arr[],int k ){
        int n = arr.length;
         reverse(arr,0,n-k-1);
         reverse(arr,n-k,n-1);
         reverse(arr,0, n-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
    static void reverse(int arr[],int k,int m){
        int i=k;
        int j = m;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }
}
