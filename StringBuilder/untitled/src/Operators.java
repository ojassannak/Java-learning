import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 2));

        System.out.println("a" + 2);
        //this is same as aftera a few steps "a" + "2"
        //Integer will be converted to Integer that will call toString()

        System.out.println("Ojas" + new ArrayList<>());
        System.out.println("Ojas" + new Integer(77));

        String ans = (new Integer(77) + "" +  new ArrayList<>());
        System.out.println(ans);
    }
}
