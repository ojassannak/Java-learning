import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number");

        int num = in.nextInt();
        if(Prime(num)) {
            System.out.println(num + " is prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }


    static boolean Prime(int num){
        if(num <= 1){
            return false;
                }
        int a = 2;
        while(a * a <= num){
            if(num % a == 0){
                return false;
            }
            a = a + 1;
        }
        return true;
    }
}
