import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = in.nextInt();
        int sum = 0;
        int ans = Palin(num,sum);
        if(num == ans){
            System.out.println("Palindrome number " );
        }else {
            System.out.println("not palindrome ");
        }
    }
    static int Palin(int num, int sum){
        while (num > 0 ){
           int r = num % 10 ;
           sum = (sum*10) + r;
           num = num/10;
        }
        return sum;
    }
}
