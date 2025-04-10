import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the number ");
        int num = in.nextInt();
        int ans = factors(num);
        System.out.print("Factor of is " + ans);
    }

    static int factors(int num){
        int fact = 1;
        for (int i = 1 ; i<=num; i++ ){
            fact = fact * i;
        }
        return fact;
    }
}
