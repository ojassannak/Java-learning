public class Fact {
    public static void main(String[] args) {
    int ams = facto(5);
        System.out.println(ams);
    }
    static int facto(int n){
        if( n <= 1){
            return 1;
        }

        return n * facto(n-1);
    }
}
