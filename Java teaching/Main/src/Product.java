import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number");
        int num1 = in.nextInt();
        System.out.print("Enter the second number");
        int num2 = in.nextInt();

      int ans = product(num1, num2);
      System.out.println("Product of two number is " + ans);

    }
    static int product(int num1, int num2){
        return num1 * num2;
    }
}
