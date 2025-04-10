public class Fibo {
    public static void main(String[] args) {
        int n  = 2;
        System.out.println(fibo(n));
//        for (int i = 0 ; i < 11 ; i++){
//            System.out.println(fibbpFormula(i));
//        }

//        System.out.println(fibbpFormula(50));
    }

//    static int fibbpFormula(int n){
//        //just for demo used long instead
//       return  (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
//    }

    static int fibo(int n) {
        //base condtion
        if (n < 2){
            return n;
        }
        return fibo(n - 1 ) + fibo( n -2);
    }
}
