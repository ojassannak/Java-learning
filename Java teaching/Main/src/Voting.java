import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the His/Her Age");
        int num = in.nextInt();
        Age(num);
    }

    static void Age(int the){
        if(the >= 18){
            System.out.println("Person is eligible to vote");
        }else {
            System.out.println("Person is not eligible to vote");
        }
    }
}
