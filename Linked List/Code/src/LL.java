import java.util.Objects;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public void insertfirst(int val){
        Node node = new Node(val);
        // node.-> head Connecting
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        //tail.-> node connecting
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int val , int index){
        if(index == 0){
            insertfirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    //insert using recursion
    public void inserRec(int val, int index){
        head = insertRec(val ,index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if (index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, --index, node.next);
        return node;
    }

    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLast =  get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if (index ==  size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;

        return val;
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

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> " );
            temp = temp.next;
        }
        System.out.println("End");
    }

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    //Question Leetcode

    public void duplicates(){
        Node node = head;
        while (node.next != null){
            if( node.val == node.next.val){
                node = node.next.next;
            }else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //Question Merge two list leetcode
    public static  LL merge(LL first , LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new  LL();
        while (f != null && s != null){
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next;
            }else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }
        while (f != null){
            ans.insertLast(f.val);
            f = f.next;
        }

        while (s != null){
            ans.insertLast(s.val);
            s = s.next;
        }

        return ans;

    }

    public  void bubbleSort(){
        bubbleSort(size - 1, 0);
    }
    private  void bubbleSort(int row , int col) {
        if (row == 0){
            return;
        }

        if (col < row){
            Node first = get(col);
            Node second = get(col + 1);

            if (first.val > second.val){
                //swap
                if (first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node pre = get(col - 1);
                    pre.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row , col + 1);
        }else {
            bubbleSort(row - 1, 0 );
        }
    }

    //Recursion reverse
    private void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // In place reversal of linked list
    //https://leetcode.com/problems/reverse-linked-list/description/ google, microsoft , apple
    public void reverse(){
        if ( size < 2){
            return;
        }

        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while (pres != null){
             pres.next = prev;
             prev = pres; //Move ahead in position of pres
             pres = next; // move ahead in position of nest;
            //null pointer check
             if (next != null){
                 next = next.next;
             }
        }
        head = prev;
    }

    //https://leetcode.com/problems/reverse-linked-list-ii/description/ microsoft, google, amazon
    //Reverse linked list II.
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        //skip the first left - 1 node
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        //reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current; //Move ahead in position of pres
            current = next; // move ahead in position of nest;
            //null pointer check
            if (next != null){
                next = next.next;
            }
        }

        if (last != null){
            last.next = prev;
        }else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }



    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(105);
        second.insertLast(42);
        second.insertLast(78);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
        ans.display();

//        ans.bubbleSort();
//        ans.display();

        LL list = new LL();

        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }

        list.display();
        list.bubbleSort();
        list.display();
    }
}

