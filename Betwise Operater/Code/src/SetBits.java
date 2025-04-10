public class SetBits {
    public static void main(String[] args) {
//        int n= 12945616;
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.println(AddBinary(a ,b));


/*
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
*/
    }

    static String AddBinary(String a , String b){
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }
//    static int setBits(int n){
//
//        int count = 0;
//
////        while (n > 0){
////            count++;
////            n -=  (n & (-n));
////        }
//
//        while (n > 0){
//            count++;
//
//            n = n & ( n - 1);
//        }
//        return count;
//    }
}
