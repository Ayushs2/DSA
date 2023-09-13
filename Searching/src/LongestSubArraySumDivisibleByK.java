public class LongestSubArraySumDivisibleByK {
    public static void main(String[] args) {
        int arr[] = {2,7,6,4,1,5};
        int k =3;
        int ans = sum(arr,k);
        System.out.println(ans);
    }
    static int sum(int arr[],int k){

        int maxLen = 0;
       // int l=0;
        for(int i=0;i<arr.length;i++){
            int sum= 0;
            int l=0;
            for (int j=i;j< arr.length;j++){
                sum = sum+arr[j];
                if (sum%3==0){
                     l = j-i+1;
                }
                if (l>maxLen)
                maxLen = l;
            }
        }
        return maxLen;
    }
}
