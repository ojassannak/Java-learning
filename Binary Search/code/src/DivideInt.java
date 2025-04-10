public class DivideInt {
    public static void main(String[] args) {
        int  dividend = 7;
        int  divisor = -3;

        System.out.println(divide(dividend,divisor));
    }
    public static int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean sign = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        dividend = dividend > 0 ? -dividend : dividend;
        divisor = divisor > 0 ? -divisor : divisor;
        int ans = 0;
        while (dividend <= divisor) {
            int x = divisor;
            int cnt = 1;
            while (x >= (Integer.MIN_VALUE >> 1) && dividend <= (x << 1)) {
                x <<= 1;
                cnt <<= 1;
            }
            ans += cnt;
            dividend -= x;
        }
        return sign ? ans : -ans;



//        int sign =((dividend < 0)^(divisor < 0)) ? -1 : 1;
//
//    dividend = Math.abs(dividend);
//    divisor = Math.abs(divisor);
//
//    int quotient = 0;
//
//        while(dividend >=  divisor){
//        dividend -= divisor;
//        quotient += 1;
//    }
//
//        if(sign == -1)
//            return -quotient;
//
//        return quotient;
//        sign  = -1;
//        int ans = 0;
//
//        boolean state = false;
//        if(dividend > divisor){
//            state = true;
//        }else{
//            ans = -ans;
//        }
//        ans = dividend / divisor;
//        Math.floor(ans);
//        return ans;
    }
}
