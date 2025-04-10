import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
       List<Boolean> result =  kidsWithCandies(candies,extraCandies);
        System.out.println(result + "");
    }
     static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List result = new ArrayList<>();
        int maxCandies = 0;

        for(int i = 0; i<n; i++){
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        for(int i = 0; i<n ; i++){
            if(candies[i] + extraCandies >= maxCandies)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
