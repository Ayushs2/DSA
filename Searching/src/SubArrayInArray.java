public class SubArrayInArray {
    public static void main(String[] args) {
        int a[] = {3,54,2,5,7,8,9,3,4,3,1,3,4,3,3,4,3};
        int b[] = {3,4,3};
        search(a,b);
//        System.out.println(search2(a,b));
    }
//    static boolean search2(int[] a, int[] b){
//        int i=0;
//        int j= 0;
//        int n = a.length;
//        int m = b.length;
//        while(i<n && j<m){
//            if (a[i]==b[j]){
//                i++;
//                j++;
//            }
//             else{
//                 i = i-j+1;
//                 j=0;
//            }
//             if (j==m)
//                 return true;
//        }
//        return false;
//    }
    static void search(int[] a, int b[]){
        int n = a.length;
        int m= b.length;
        for (int i = 0; i <n-m+1; i++) {
            int j;
            for (j = i;  j<i+m ; j++) {
                if (a[j]!=b[j-i])
                    break;
            }
            if (j == i+m)
                System.out.println("present");

        }

    }
}
