public class ContainerWithMaxWateer {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7,9};
        System.out.println(waterhold(arr));
    }
    static int water(int arr[]){
        int n =arr.length;
        int water =0;
        int maxwater =0;
        for(int i=0;i<n;i++){
            for (int j = i+1; j <n ; j++) {
                int height = Math.min(arr[i],arr[j]);
                water = height*(j-i);

            }
            if(water>=maxwater){
               maxwater =water;
            }
        }
        return maxwater;
    }
    //Optimized Approach
    //Two pointers Approach
    static int waterhold(int arr[]){
        int n = arr.length;
        int s=0;
        int e = n-1;
        int water =0;
        int maxwater=0;
        while(s<e){
            int height = Math.min(arr[s],arr[e]);
            water = height*(e-s);
            if(arr[s]<=arr[e]){
                s++;
            }
            else{
                e--;
            }
            if(water>=maxwater)
                maxwater =water;
        }
        return maxwater;
    }
}
