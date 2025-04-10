import java.util.Arrays;
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int aLen = arr1.length;
        int bLen = arr2.length;

        int[] result;
        result = new int [aLen + bLen];
        System.arraycopy(arr1, 0, result, 0, aLen);
        System.arraycopy(arr2, 0, result, aLen, bLen);
        System.out.println(Arrays.toString(result));

    }
}
