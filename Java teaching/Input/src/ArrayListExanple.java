import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExanple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(5);
//        list.add(55);
//        list.add(15);
//        list.add(78);
//        list.add(99);
//        list.add(10);
//
//        System.out.println(list);
//         list.set(0, 7);
//         list.remove(5);
//        System.out.println(list);

        for (int i = 0; i < 5; i ++){
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i ++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
