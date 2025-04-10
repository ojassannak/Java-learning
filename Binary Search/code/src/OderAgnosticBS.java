public class OderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {44,33,22,19,12,10,7,5,1};
         int target = 19;
         int ans = oderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int oderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

//        find the array is sorted in ascending or descending order
        boolean IsAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;
            //        Check if mid element is equal to target element
            if (arr[mid] == target) {
                return mid;
            }

            if (IsAsc) {
                if(target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
