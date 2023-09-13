import java.util.Arrays;
// time complexity is O(n log n)
//log n for dividing array int half and n for merging arrays;
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        int ans[] = mergeSort(arr,n);
//       MergeSort ob = new MergeSort();
//         ob.mergeSort(arr,n);
        for (int i :ans){
            System.out.println(i);
        }


    }
    public static int[] mergeSort(int arr[],int n){
        //base condition
        if(arr.length<2)
            return  arr;
        int mid = arr.length/2;//every time the recursion call works it creates new arrays l and r and add elements to it
        int l[] = new int[mid];
        int r[] = new int[n-mid];

        for (int i = 0; i < mid ; i++) {//taking input elements to array
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i-mid] = arr[i];//i-mid makes the index 0 1 2...
        }
         mergeSort(l,mid);
        mergeSort(r,n-mid);//bacha hua part array ka;
        return merge(arr,l,r);
//      int l[] =  mergeSort(Arrays.copyOfRange(arr,0, mid));
//        int r[]= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        // return merge(arr,l,r);

    }
   public static int[] merge(int arr[],int a1[],int a2[]) {
       int n = a1.length;
       int m = a2.length;
//int c[] = new int[m+n]  mistake *** pass in method argument
       int ai = 0, bi = 0, k = 0;
       while (ai < n && bi < m) {
           if (a1[ai] <= a2[bi]) {
               arr[k] = a1[ai];
               ai++;
               k++;
           } else if (a1[ai] > a2[bi]) {
               arr[k] = a2[bi];
               bi++;
               k++;
           }
       }
       while (ai < n) {
           arr[k] = a1[ai];
           ai++;
           k++;
       }
       while (bi < m) {
           arr[k] = a2[bi];
           bi++;
           k++;
       }
//       public static void merge( int[] a, int[] l, int[] r, int left, int right) {
//
//           int i = 0, j = 0, k = 0;
//           while (i < left && j < right) {
//               if (l[i] <= r[j]) {
//                   a[k++] = l[i++];
//               }
//               else {
//                   a[k++] = r[j++];
//               }
//           }
//           while (i < left) {
//               a[k++] = l[i++];
//           }
//           while (j < right) {
//               a[k++] = r[j++];
//           }
//       }
        return arr;
   }
}
