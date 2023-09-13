public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {7,5,6,3,2,9,1,0};
        bubbleSort(arr);
        //In Bubble sort we compare adjacent elements and swap them
    }
    static void bubbleSort(int arr[]){
        int n =arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j =0; j < n-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.print(arr[j]+" ");

            }
            System.out.println(arr[n-1]+" ");
            System.out.println();
      
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");

        }
    }

}
