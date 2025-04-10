import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = in.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = in.nextInt();

       boolean ans = Tri(a,b,c);
         if(ans == true){
             System.out.println("Pythagorean Triplets");
         }else{
             System.out.println("Not Pythagorean Triplets");
         }
    }

    static boolean Tri(int a ,int b, int c ){
       if(a*a + b*b == c*c ||
           a*a + c*c == b*b ||
           b*b + c*c == a*a){
           return true;
        }
       return false;
    }
}
