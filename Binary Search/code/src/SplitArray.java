public class SplitArray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]); //in the end of the loop this will contain max item from the array
            end += nums[i];
        }

        //binary search

        while (start < end){
            //try for the middles as potentail answer
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for(int num :  nums){
                if(sum + num > mid){
                    // you can not add this in subarray make new one

                    sum = num;

                    pieces++;
                }else {
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid + 1;
            }else {
                end = mid;
            }

        }
        return end; // start == end
    }
}
