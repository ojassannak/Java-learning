public class uniqueNo {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 1 , 4 , 2 , 7 , 4};

        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
       int unique = 0;

       for(int n : arr){
           unique ^= n;
       }
        return unique;
    }
}
