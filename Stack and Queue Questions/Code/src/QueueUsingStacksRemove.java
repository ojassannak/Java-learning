import java.util.Stack;

//Remove Efficient

//this makes Removal constant O(1)
// and insertion O(n)
public class QueueUsingStacksRemove {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacksRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) throws Exception {
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(x);
        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int pop() throws Exception {
       return first.pop();
    }

    public int peek() throws Exception {
        return first.peek();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
