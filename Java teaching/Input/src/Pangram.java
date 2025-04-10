import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
    String sentence = "leetcode";

       boolean set = checkIfPangram(sentence);
        System.out.println(set + "");
    }
    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i<sentence.length(); i++){
            char c  = sentence.charAt(i);
            if( c >= 'a' && c<= 'z')
                set.add(c);
        }
        return set.size() == 26;
    }
}
