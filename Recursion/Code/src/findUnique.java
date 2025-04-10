public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2,1,2,8,4,1,4};

        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;

        for (int n : arr ){
            unique ^= n;
        }

        return unique;
    }
}
