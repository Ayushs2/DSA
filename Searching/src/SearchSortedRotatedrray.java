public class SearchSortedRotatedrray {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,10,1,2,3,4};
        int x = 1;
        System.out.println(search(arr,x));
    }
    static int search(int arr[],int x){
        int n  = arr.length;
        //Simple Binary search
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid] ==x)
                return mid;
            if (arr[low]<=arr[mid]){
                if (x>=arr[low] && x<=arr[mid]){
                    high = mid-1;
                }
                else
                    low = mid+1;
            }
            else
                if (x<=arr[high] && x>=arr[mid]){
                    low = mid+1;
                }
                else
                    high = mid-1;
        }
        return -1;
//    }
//static int search(int[] nums, int target) {
//
//    int left = 0, right = nums.length - 1;
//
//    while (left <= right) {
//        int mid = ((right - left) / 2) + left;
//
//        if (nums[mid] == target)
//            return mid;
//        if (nums[left] <= nums[mid]) {
//            if (target >= nums[left] && target <= nums[mid]) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        } else {
//            if (target >= nums[mid] && target <= nums[right]) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//    }
//
//    return -1;
}
}
