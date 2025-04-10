public class DigitSum {
    public static void main(String[] args) {
        System.out.println(Sum(1324));
    }
    static int Sum(int n){
        //base case
        //TS ; O(log(n))
        if(n == 0){
            return 0;
        }
        return (n % 10) + Sum(n / 10);
    }
}
