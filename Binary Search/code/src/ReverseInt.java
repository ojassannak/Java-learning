public class ReverseInt {
    public static void main(String[] args) {
      int x = -123;
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        boolean isNegative = false;
        if(x<0){
            isNegative = true;
            x = -x;
        }

        long count = 0;

        while(x > 0){
            count = count*10 + x%10;
            x = x / 10;
        }
        if(count > Integer.MAX_VALUE){
            return 0;
        }
        return (int) (isNegative ? -count :count);
   }
}
