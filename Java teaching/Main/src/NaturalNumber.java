import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Natural number ");

        int n = in.nextInt();
        int ans =   natural(n);
        System.out.println("Sum of natural number " + ans);
    }
    static int natural(int n){
        int sum = 0;
        for(int i = 1; i<=n ; i++){
            sum = sum + i;
        }
        return sum;
    }
}
