public class Arrays {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println( lengthOfLasWord(s));

    }

    static  int lengthOfLasWord(String s){
        int count = 0;
        String a = s.trim();

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == ' '){
               count = 0;
            }else {
                count++;
            }
        }
         return count;
    }
}