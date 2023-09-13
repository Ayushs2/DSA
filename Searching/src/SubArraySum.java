public class SubArraySum {
    public static void main(String[] args) {
        int [] a = {2,-6,4,-3,2,1,-1,2};

        System.out.println(subarray(a));
                
    }
    static int subarray(int a[]){
        int n = a.length;
        //int m = b.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j <n ; j++) {
                sum+=a[j];
                if (sum<0)
                {
                    sum = 0;
                    break;
                }
            }
            if(sum>max)
                max=sum;
            
        }
        return max;

    }
}
