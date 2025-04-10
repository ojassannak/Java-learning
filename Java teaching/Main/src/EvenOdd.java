import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number ");
        int num = in.nextInt();
         evenOdd(num);
    }

   public static void evenOdd(int num){
           if(num % 2 == 0){
           System.out.println("Entered number is enen  ");
           }else {
               System.out.println("Entered number is odd");
           }
    }
}
