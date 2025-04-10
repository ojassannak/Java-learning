import java.util.Collections;
import java.util.Stack;

public class MinSwapsParentheses {
    public static void main(String[] args) {
     String s = "]]][[[";

        System.out.println(minSwaps(s));
    }

    public static int minSwaps(String s) {
        int count = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == '['){
                 count++;
             }else {
                 count--;
             }
             if (count < 0){
                 //swap
                 result++;
                 count = 1;
             }
        }
        return result;
    }
}
