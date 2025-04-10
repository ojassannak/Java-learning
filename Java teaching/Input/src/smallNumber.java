import java.util.Arrays;

public class smallNumber {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
       int[] arr = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // int count = 0;
        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            int length = 0;
            int num = nums[i];
            for(int j = 0; j<nums.length; j++)
            {
                if(num-nums[j] > 0 && num != nums[j])
                    length = length + 1;
            }
            arr[i]= length;
        }
        return arr;
    }
}
