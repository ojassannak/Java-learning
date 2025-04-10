import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//         int num1 = input.nextInt();
//         int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println(" sum = " + sum);

//        Type casting
//        int num = (int)(17.20);
//        System.out.println(num);

        // automatic type promotion in expression

//        int a = 258;
//        byte b = (byte)(a);   // 258 % 256 = 2


//        byte b = 77;
//        char c = 'o';
//        int i = 4700;
//        short s = 1024;
//        float f = 23.49f;
//        double d = 0.1256;
//
//        double result = (f * b ) + (i / c) - (d * s);
//        System.out.println((f * b ) + " " + (i / c) + " " +  (d * s));
//        System.out.print("Enter number =");
//        int num =  input.nextInt();
//        if(num %2 == 0){
//            System.out.println(" The number is even ");
//        }else{
//            System.out.println(" The number is odd ");
//        }

//        String name = input.next();

//        Simple interest Problem
//        int P = 1479;
//        int R =  45;
//        int T = 1;
//        int SI = (P * R * T) / 100;


//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        if(num1 >= num2){
//            System.out.println("Num1 Is largest");
//        }else {
//            System.out.println(" Num2 Is largest ");

//      Q:  Count Nums

        int n = 25884;

       int count = 0;

        while (n > 0){
            int rem = n % 10;
           if(rem == 8){
               count++;
            }
           n = n / 10;
        }
        System.out.println(count);
    }
}