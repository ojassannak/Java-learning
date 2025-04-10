public class DLL {
    private Node head;
//    private Node tail;

    public void insertFirst(int val){
        Node node = new Node(val);

        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        if(head == null){
            head = node;
            node.prev = null;
            return;
        }

        node.next = null;

        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }

    public void insertAfter(int after, int val){
        Node p = findNode(after);

        if ( p == null){
            System.out.println("Node does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public Node findNode(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node node = head;
        Node last =  null;
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");

        System.out.println("Print in reverse");
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }


  private class Node{
        int val;
        Node next;
        Node prev;

      public Node(int val) {
          this.val = val;
      }

      public Node(int val, Node next, Node prev) {
          this.val = val;
          this.next = next;
          this.prev = prev;
      }
  }
}
