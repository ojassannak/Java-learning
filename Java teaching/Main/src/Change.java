import java.util.Arrays;

public class Change{
    public static void main(String[] args) {
        int[] arr = {1,21,47,5,8,9};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changeValue(int[] num){
        num[0] = 77;
    }
}
