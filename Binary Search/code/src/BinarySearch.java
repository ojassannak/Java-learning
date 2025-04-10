
public class BinarySearch {
    public static void main(String[] args) {
 int[] arr = {-18,-14,-4,0,2,8,12,18,20,44,62};
 int target = 18;
 int ans = binarySearch(arr, target);
        System.out.println(ans);
        }


//        return the index
//    return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
//            find the middle element
//            int mid = start + end / 2; might be possible that it may exceed the int range
            int mid = start + (end - start) / 2 ;
            if(target< arr[mid]){
                end = mid - 1;
            } else if (target> arr[mid]) {
                start = mid + 1;
            }else{
//                ans fund
                return  mid;
            }
        }
        return -1;
    }
}
