import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class InbuildExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(14);
//        stack.push(48);
//        stack.push(68);
//        stack.push(10);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();

        queue.add(15);
        queue.add(17);
        queue.add(78);
        queue.add(45);

        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();

         deque.add(15);
         deque.add(72);
         deque.add(11);
         deque.add(36);
         deque.addFirst(44);
         deque.addLast(1);

        System.out.println(deque);
    }
}