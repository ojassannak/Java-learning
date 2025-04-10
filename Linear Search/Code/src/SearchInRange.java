public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,5,8,55,7,3,9};
        int target = 55;
        System.out.println(LineatSearch(arr, target, 1, 4));
    }
    static int LineatSearch(int[] arr, int target, int start, int end){
//        if the arr is not found
        if( arr.length == 0){
            return -1;
        }

        for (int index = start; index<=end; index++){
//            check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
//        this line will excute if none of the return statement above excuted
//        that means target not found
        return -1;
    }
}
