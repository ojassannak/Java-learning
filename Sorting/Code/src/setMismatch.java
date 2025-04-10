import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/
public class setMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};

        System.out.println(Arrays.toString( findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i , correct);
            }else {
                i++;
            }
        }

        //searching missing and duplicate element.

        for (int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
              return new int[] {nums[index] , index + 1};
            }
        }
        return new int[] {-1 ,-1};
    }

    static void swap(int[] nums, int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
