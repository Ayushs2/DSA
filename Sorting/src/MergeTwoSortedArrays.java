public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int a1[] = {1,2,3,5,6,9,11};
        int a2[] = {1,3,4,7,8,11};
        int n = a1.length;
        int m= a2.length;
      int ans[] = merge(a1,a2);
        for (int i: ans) {
            System.out.print(i+" ");
        }
    }
    static int[] merge(int a1[],int a2[]){
        int n = a1.length;
        int m = a2.length;
        int c[] = new int[n+m];//new Array of length m+n
        int ai=0;int bi=0;int ci=0; //ai,bi and ci are the pointers traversing through array a1,a2,c
        while(ai<n &&bi<m) {  //looping until we reach the end of array
            if (a1[ai] <= a2[bi]) { // comparing elements in both the arrays. Which one is lower adding it to c
                c[ci] = a1[ai];
                ai++; //after adding we move the pointers forward
                ci++;
            } else if (a1[ai] > a2[bi]) {
                c[ci] = a2[bi];
                bi++;
                ci++;
            }
        }
            while (ai<n){ //cheking if array a2 is exhausted then simpily adding a1's element to c
                c[ci] = a1[ai];
                ai++; //and increasing the pointers of both array
                ci++;
            }
            while (bi<m){ //if 1st array is exhausted then simply adding 2nd arrays elements to c
                c[ci] = a2[bi];
                ci++;
                bi++;
            }
        return c; // returning array c
    }


}
