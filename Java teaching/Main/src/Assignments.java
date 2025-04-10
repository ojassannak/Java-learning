import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
//        Q ; Area of circule
//        int r;
//        double Pi = 3.14, area;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter radious of circle");
//         r = in.nextInt();
//        area = Pi * r * r;
//        System.out.println("Area of circle " + area);


//        Q : Arwa of Tringle
//        int b ,h;
//        int area;
//        Scanner in = new Scanner(System.in);
//        System.out.print ("Enter height And base");
//        h = in.nextInt();
//        b = in.nextInt();
//        area = b * h / 2;
//        System.out.println("Area of tringle " +area);

//        Q: Area Of Rectangle Program
//        int w,l;
//        int area;
//        Scanner in = new Scanner(System.in);
//        System.out.print ("Enter width And length");
//        w = in.nextInt();
//        l = in.nextInt();
//        area = w * l;
//        System.out.println("Arwa of rectangle " + area);


//       Q: Area Of Equilateral Triangle
//        int a
//        double area;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the side");
//        a = in.nextInt();
//        area = Math.sqrt(3)/4 * a * a ;
//        System.out.println("Equilateral triangle " + area );

//        Q: perimeter of circle
//        int r;
//        double Pi = 3.14, area;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Radius");
//        r = in.nextInt();
//        area = 2 * Pi * r;
//        System.out.println("perimeter of circle " + area);

//        Q: perimeter of parallelogram
//        int a,b, perimeter;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the side and base");
//        a = in.nextInt();
//        b = in.nextInt();
//        perimeter = 2 *(a + b);
//        System.out.println("perimeter of parallelogram " + perimeter);

//       Q: Input a number and print all the factors of that number (use loops).
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number");
//        int a = in.nextInt();
//        int count  = 1;
//        while (count <= a) {
//           if (a % count == 0){
//               System.out.println(count + " ");
//           }
//            count++;
//        }

//       Q: Take integer inputs till the user enters 0 and print the largest number from all.

        Scanner in = new Scanner(System.in);
        int count = 0;
        int input;
         do{
             System.out.print("Enter the number");
                input = in.nextInt();
             System.out.println("Enter 0 to end the loop");
              count += input;
         }while(input > 0);
        System.out.println("Sum is" + count);

    }
}
