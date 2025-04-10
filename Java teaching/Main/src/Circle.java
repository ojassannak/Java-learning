import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius ");
        int r = in.nextInt();

       double ans = CircleOfArea(r);
        System.out.println("Area of circle " + ans);
        double circumferenc = circumferencOdCircle(r);
        System.out.println("circumference of circle " + circumferenc);
    }
    static double CircleOfArea(int r){
        return Math.PI * r * r;
    }
    static double circumferencOdCircle(int r){
        return Math.PI * 2 * r;
    }
}
