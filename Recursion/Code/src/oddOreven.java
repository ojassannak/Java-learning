public class oddOreven {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
