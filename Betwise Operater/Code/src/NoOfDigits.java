public class NoOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;

        int ams = (int) (Math.log(n) / Math.log(b)) + 1;

        System.out.println(ams);
    }
}
