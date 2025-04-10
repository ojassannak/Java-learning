import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in   = new Scanner(System.in);
        // input using for loop

        int[] arr = new int[5];

        for (int i = 0 ; i< arr.length; i ++ ){
            arr[i]= in.nextInt();
//            System.out.print(arr[i] +  " ");
        }

        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}