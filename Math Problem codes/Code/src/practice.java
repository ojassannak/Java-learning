import java.security.KeyStore;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
//        String str1 = "Ojas";
//        String str2  = "soja";

        String str1 = "I am happy";

        System.out.print(check(str1));
    }


    static String check(String str1) {
//        String str3  = str1.concat(str2);
        String str2 = "";
        char ch;

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);

            str2 += ch;
        }
        return str2;
//
//        boolean result = true;
//        for (int i = 0; i < str1.length(); i++) {
//            if (str3.indexOf(str1.charAt(i)) == -1){
//                    result = false;
//                    break;
//                }
//            }
//        return result;
    }
}

