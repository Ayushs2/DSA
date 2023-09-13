public class MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {2,3,4,5,6,7};
        int arr2[] = {5,6,7,8};
        int n = arr1.length;
        int m = arr2.length;
        int newarr[] = new int[n+m]; //Creating new array of length m+n
        for (int i = 0; i < n; i++) { // looping through 1st array and adding elements to the new array
                newarr[i]=arr1[i];
        }
        for (int i = 0; i <m ; i++) { //starting form the end of the 1st array and adding elemments of 2nd array to new array
            newarr[n + i] = arr2[i];
        }
        for (int i = 0; i <n+m ; i++) {
            System.out.print(newarr[i]+" ");

        }
    }
}
