import java.util.Arrays;

//https://leetcode.com/problems/first-missing-positive/submissions/1150488382/
public class firstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(Arrays.toString(firstMissingPositive(nums)));
    }
    public static int[] firstMissingPositive(int[] nums) {
        int i = 0;
        while( i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i]  <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct) ;
            }else{
                i++;
            }
        }
        //search for first missing number
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return new int[]{index + 1};
            }
        }
        //case 2
        return new int[]{nums.length + 1};
    }

   static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
}
