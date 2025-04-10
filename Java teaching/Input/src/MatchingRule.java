import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingRule {
    public static void main(String[] args) {
       List<List<String>> items = new ArrayList<List<String>>();

       List<String> l1 = new ArrayList<>();
       l1.add("phone");
       l1.add("blue");
       l1.add("pixel");
       items.add(l1);

        List<String> l2 = new ArrayList<>();
        l2.add("computer");
        l1.add("silver");
        l2.add("lenovo");
        items.add(l2);

        List<String> l3 = new ArrayList<>();
        l3.add("phone");
        l3.add("gold");
        l3.add("iphone");
        items.add(l3);
        String ruleKey = "color", ruleValue = "silver";
        int  count = countMatches(items,ruleKey,ruleValue);
        System.out.println(count);
    }
     static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        //   List<String> ans = new <String>();
        for(List<String> item : items){
            String type = item.get(0), color = item.get(1), name = item.get(2);
            if("type".equals(ruleKey) && type.equals(ruleValue))
                count++;
            else if("color".equals(ruleKey) && color.equals(ruleValue))
                count++;
            else  if("name".equals(ruleKey) && name.equals(ruleValue))
                count++;
        }
        return count;
    }
}
