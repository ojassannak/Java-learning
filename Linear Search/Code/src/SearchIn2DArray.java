import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {44,5,66,77,9},
                {47,58,11,12},
                {8,7}
        };
        int target  = 7;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target){

        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
//      Find Max Value
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int eleement : ints) {
                if (eleement > max) {
                    max = eleement;
                }
            }
        }
        return max;
    }
}
