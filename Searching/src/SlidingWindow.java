public class SlidingWindow {
    public static void main(String[] args) {
        int a[] = {10,34,9,15,21,5,11,16};int k =4;
        int n = a.length;
        //10 34 9 15 = sum
        //34 9 15 21 = sum+21-10 = sum
        //9 15 21 5 = sum+5-34 = sum
        //15 21 5 11 = sum+11-9 = sum
        //21 5 11 16 = sum+16-15 = sum
        // i - i+k
        int sum = 0;
        int s = -1;
        int e = -1;
        //int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum+=a[i];
        }
        int max = sum;
        for (int i = k; i <n ; i++) {
            sum+=a[i]-a[i-k];
            if(sum>max){
                max = sum;

        }


        }
        System.out.println(max+" "+ s+" "+ e);
    }

}
