public class RBS {
    public static void main(String[] args) {
    int[] nums = {4,5,6,7,0,1,2};

        System.out.println(findPivot(nums));
    }

   static int search(int[] nums, int target) {
    int pivot = findPivot(nums);

//    if we did not find pivot it meas the array is not rotated

       if(pivot == -1){
//           just do normal binary search
           return binarySearch(nums,target,0, nums.length -1);
       }

       // if we pivot is found we found 2 asce sorted arrys
       if(nums[pivot] == target){
           return pivot;
       }

       if(target >= nums[0]){
           return binarySearch(nums, target, 0, pivot- 1);
       }
       return  binarySearch(nums, target,pivot+1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
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

    // this will not work in duplicate value
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
