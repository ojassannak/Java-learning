public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1,5,8,55,7,3,9};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
