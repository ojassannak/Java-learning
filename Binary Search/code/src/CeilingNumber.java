import java.util.Arrays;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 9;

       int result  = ceiling(arr, target);
        System.out.println(result);
    }

//    return inde : smalest number >= traget
    static int ceiling(int[] arr, int target){

        // but what if the target elemment is greater than gretest element in arr

        if(target > arr.length - 1){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid -1;
            }else {
                return mid;
            }
        }
        return arr[start];
    }
}
