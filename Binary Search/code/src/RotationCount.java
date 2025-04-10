public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(countRotation(nums));
    }

    private static int countRotation(int[] nums) {
        int pivot = findPivot(nums);
       return pivot + 1;
    }

    //Use this for nonDuplicates
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            int mid = start + (end - start) / 2;

//            four casses over here
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    //Use this for duplicates
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            int mid = start + (end - start) / 2;

//            four casses over here
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // if element at midddle ,start ,end are equal then just skip the duplicates
            if(arr[mid] == arr[start]  && arr[mid] == arr[end]){
                // skip the duplicate
                //NOTE : what if these element at start and end were the pivot
                //check if start is pivot or not
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                //check whether end is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }

            //left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
