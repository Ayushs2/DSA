public class LargestsubArraySumK {
    public static void main(String[] args) {
        //size of sub array is fixed
        int arr[] = {3,8,12,-13,-4,98,-50,24,-100,11,200};
        int k  = 3;
        System.out.println(maxsumk(arr,k));
    } static int[] an;
    static int maxsumk(int arr[],int k){
        int n  = arr.length;
        int ans =0;
        int s=-1,e=-1;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i <n-k+1; i++) { //n-k+1 makes the loop to run till n-3+1 i.e at last for sub array 3 i loop runs 1 times and j 3 times
            int sum = 0;
            for (int j = i; j <= i+k-1; j++) {
                sum += arr[j];
                s=i;
                e=j;
            }
            if (sum>mx)
                mx = sum;
            ans = mx;


        }
        System.out.println("Starting and ending index are "+s+", "+e);
        return ans;
    }
}
