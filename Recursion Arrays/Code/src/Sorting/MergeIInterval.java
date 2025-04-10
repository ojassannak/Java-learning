package Sorting;

import java.util.Arrays;

public class MergeIInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

         int[][] ans =  merge(intervals);
        System.out.println(Arrays.deepToString(ans));

    }
    public static int[][] merge(int[][] intervals) {
        //Base condition
        if(intervals.length == 1){
            return intervals;
        }

        int mid = intervals.length / 2;

        int[][] left = merge(Arrays.copyOfRange(intervals, 0, mid));
        int[][] right = merge(Arrays.copyOfRange(intervals, mid, intervals.length));


        return Merge(left, right);
    }
    public static int[][] Merge(int[][] first, int[][] second){
        int[][] mix = new int[][]{new int[first.length + second.length]};

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if (first[i][0] > second[j][0]) {
                mix[k] = second[j];
                j++;
            } else {
                mix[k] = first[i];
                i++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(i < second.length){
            mix[k] = second[i];
            j++;
            k++;
        }
        return mix;
    }

}
