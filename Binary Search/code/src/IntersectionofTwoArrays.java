import java.util.Arrays;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans = TwoArrays(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] TwoArrays(int[] nums1, int[] nums2){
//        int[] ans = new int[nums1.length];
//
//        int[] visited = new int[nums2.length];
//        for (int k : nums1) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums2[j] == k && visited[j] == 0) {
//                    ans.add(nums2[j]);
//                    visited[j] = 1;
//                    break;
//                } else if (nums2[j] > k)
//                    break;
//            }
//        }
//        return ans;

        int start = 0;
        int end = nums1.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(nums2[mid] == nums1[mid]){
                return nums2;
            }else if (nums2[mid] > nums1[mid]){
               end = mid-1;
            }else {
                start = mid + 1 ;
            }
        }
        return new int[]{1};
    }
}
