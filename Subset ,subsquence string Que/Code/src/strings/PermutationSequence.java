package strings;

import java.util.ArrayList;
import java.util.Collections;

public class PermutationSequence {
    public static void main(String[] args) {
        System.out.println(getPermutation(3,3));
    }
    static void swap(char s[] , int i , int j){
        char ch = s[i];
        s[i] = s[j];
        s[j] = ch;
    }

    static void PermutationHelper(char s[], int index, ArrayList<String> ans){
        if(index == s.length){
            String str = new String(s);
            ans.add(str);
            return;
        }

        for(int i = index; i < s.length; i++){
            swap(s, i ,index);
            PermutationHelper(s , index + 1, ans);
            swap(s, i ,index);
        }
    }

    public static String getPermutation(int n, int k) {
        String s= "";
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            s += i;
        }

        PermutationHelper(s.toCharArray(), 0, ans);

        Collections.sort(ans);
        return ans.get(k - 1);
    }
}
