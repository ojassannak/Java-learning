import java.util.Arrays;

public class ArrraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
             sum = sum + nums[i];
        }
        System.out.println((sum));
    }
}
