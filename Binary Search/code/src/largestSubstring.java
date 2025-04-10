import java.lang.reflect.Array;
import java.util.Arrays;

public class largestSubstring {
    public static void main(String[] args) {
      String s = "cbzxy";
        System.out.println((maxLengthBetweenEqualCharacters(s)));
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        int[] d = new int[26];
        Arrays.fill(d, -1);
        int ans = -1;

        for(int i = 0; i< s.length(); i++){
            int j = s.charAt(i) - 'a';
            if(d[j] == -1){
                d[j] = i;
            }else{
                ans = Math.max(ans, i - d[j] - 1);
            }
        }
        return ans;
    }
}
