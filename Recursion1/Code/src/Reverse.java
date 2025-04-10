public class Reverse {
    static int sum = 0;
    static void rev( int n){
        if (n == 0){
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);
    }

    static int rev1(){
        //Sometimes might need some additional variable im the argument
        //in that case make another function
      int digits = (int) (Math.log10(1324)) + 1;
        return helper(1324, digits);
    }

    private static int helper(int n, int digits) {
        if(n % 10 == 0){
            return n;
        }

        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n /10 , digits - 1);
    }

    public static void main(String[] args) {
        System.out.println(rev1());
    }
}
