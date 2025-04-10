public class removedigit {
    public static void main(String[] args) {
        String number = "1231";
         char digit = '1';

        System.out.println(deleteDigit(number, digit));
    }

    static String deleteDigit(String  number , char digit){

        char[] digits = number.toCharArray();
        int lastDig = 0;
        for(int i = 0;i < digits.length;i++){
            if(digits[i]==digit){
                lastDig = i;
                if(i+1==digits.length || digits[i+1]>digits[i]){
                    return number.substring(0, i) + number.substring(i+1);
                }
            }
        }
        return number.substring(0,lastDig) + number.substring(lastDig+1);
    }
}
