public class Comparision {
    public static void main(String[] args) {

        String a = "James";
        String b = "James";
        String c = a;
        // == is a comparator
        System.out.println(c == a );

        String name1 = new String("Ojas");
        String name2 = new String("Ojas");

//        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));  // equals is method to check only values
    }
}
