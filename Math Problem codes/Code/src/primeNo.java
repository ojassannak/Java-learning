// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class primeNo {
    public static void main(String[] args) {
   int n = 20;
   for(int i = 1; i <= n; i++){
       System.out.println(i + " " + isPrime(i));
   }
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while (c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}