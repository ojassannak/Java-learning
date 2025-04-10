
public class Main {
    public static void main(String[] args) {
int[] nums = {2,15,68,5,7,2,3};
int target = 77;

int ans = LineatSearch(nums, target);
        System.out.println(ans);
    }
//    search in the array : return the index if item is found
//    otherwise item not found return -1

//    search tthe target and return true or false
static boolean LineatSearch3(int[] arr, int target) {
//        if the arr is not found
    if (arr.length == 0) {
        return false;
    }

    for (int index = 0; index < arr.length; index++) {
//            check for element at every index if it is = target
        int element = arr[index];
        if (element == target) {
            return true;
        }
    }
//     this line will excute if none of the return statement above excuted
//     that means target not found
    return false;
}


//    search the traget and return the element
static int LineatSearch2(int[] arr, int target) {
//        if the arr is not found
    if (arr.length == 0) {
        return -1;
    }

    for (int element : arr) {
        if (element == target) {
            return element;
        }
    }
//        this line will excute if none of the return statement above excuted
//        that means target not found
    return Integer.MAX_VALUE;
}


    static int LineatSearch(int[] arr, int target){
//        if the arr is not found
        if( arr.length == 0){
            return -1;
        }

        for (int index = 0; index<arr.length; index++){
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