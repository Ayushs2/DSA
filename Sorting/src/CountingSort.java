public class CountingSort {
    public static void main(String[] args) {
        int[] a= {0,0,0,2,2,2,3,3,3,3};
        int n =a.length;
        int h[] = new int[4];

        //0 2 3 4 4
        //0 0 0 0 0
        //3 0 1 0 0re
        for (int i = 0; i <n ; i++) {
        h[a[i]]++;
            System.out.println(h[a[i]]);
        }
        int j=0;
        for (int i = 0; i < 4; i++) {
            while (h[i]!=0){
                a[j] = i;
                j++;
                h[i]--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
