package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
   int[] arr = {5,1,1,2,0,0};

   sort(arr, 0, arr.length- 1);
        System.out.println(Arrays.toString(arr));

       // Arrays.sort(arr);
    }
static void sort(int[] nums, int low, int high){
    //base condition
    if (low >= high){
        return;
    }

    int s = low;
    int e = high;
    int m = s + ( e - s) / 2;
    int pivot =  nums[m];

    while (s <= e){

        //also a reason why if its already sorted it wil not swap
        while(nums[s] < pivot){
            s++;
        }
        while(nums[e] > pivot){
            e--;
        }

        if (s <= e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    //now my pivot is at correct index, please sort two halves now
    sort(nums, low, e);
    sort(nums , high ,s);
 }
}
