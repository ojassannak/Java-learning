public class SmallestChar {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char targert = 'c';
        char result =  SmallChar(letters, targert);
        System.out.println(result);
    }

    static char SmallChar(char[] letters, char target){

        int start = 0;
        int end = letters.length - 1; ;

        while(start <= end ){

            int mid = start + ( end - start)/ 2 ;

            if(letters[mid] > target ) {
                return letters[mid];
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
