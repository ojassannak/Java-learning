import java.util.Arrays;

public class FindRightInterval {
    public static void main(String[] args) {
    int[][] intervals = {{1,2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
    public static int[] findRightInterval(int[][] intervals) {
        int[] res = new int[intervals.length];
        for(int i = 0; i< intervals.length; i++){
            int min = Integer.MAX_VALUE;
            int minindex = -1;
            for(int j = 0; j< intervals.length; j++){
                if(intervals[j].length >= intervals[i].length && intervals[j].length < min);{
                    min = intervals[j].length;
                    minindex = j;
                }
            }
            res[i] = minindex;
        }
        return res;
    }
}
