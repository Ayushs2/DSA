public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10 ,9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i <arr.length; i++) {
            int mni = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    mni = j;
                    int temp = arr[i];
                    arr[i] = arr[mni];
                    arr[mni] = temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
