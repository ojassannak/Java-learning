public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        System.out.println(maxRange(arr, 0 , 3));
    }

    static int maxRange(int[] arr, int start, int end){
        int maxValue = arr[start];
        for (int i = start; i<= end; i++){
            if(arr[i] > maxValue ){
                maxValue = arr[i];
            }
        }
        return maxValue;

//    static int max(int[] arr){
//        int maxValue = arr[0];
//        for (int i = 1; i< arr.length; i++){
//            if(arr[i] > maxValue ){
//                maxValue = arr[i];
//            }
//        }
//        return maxValue;
    }
}
