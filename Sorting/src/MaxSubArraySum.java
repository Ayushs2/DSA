public class MaxSubArraySum {
    public static void main(String[] args) {

        int arr[] = {4,5,-9,-6,2};
        int ans = subArraySumTwoLoops(arr);
        System.out.println(ans);
    }
//    static int subArraySum(int arr[]){
//        int n = arr.length;
//        int s=-1,e=-1;
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j <n ; j++) {
//                int sum=0;
//                for (int k = i; k <= j; k++) {
//                    sum+=arr[k];
//                }
//                if (max<sum){
//                    max = sum;
//                    s=i;
//                    e = j;
//                }
//            }
//        }
//        System.out.println(s+" "+e);
//        return max;
//    }
    static int subArraySumTwoLoops(int arr[]){
        int n = arr.length;
        int s=-1,e=-1;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j <n ; j++) {
                sum += arr[j];

                if (max<sum){
                    max = sum;
                    s=i;
                    e = j;
                }
            }
        }
        System.out.println(s+" "+e);
        return max;
    }
}
