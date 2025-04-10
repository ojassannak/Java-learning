public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78};
        int target = 4;
        System.out.println(BSearch(arr,target , 0, arr.length-1));

    }

    static int BSearch(int[] arr , int target, int s , int e){
        if(s > e ){
            return -1;
        }
        int mid = s + (e - s) / 2;
        if(target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
         return BSearch(arr,target ,s ,mid -1 );
        }
         return BSearch(arr,target ,mid + 1 ,e );
    }
}
