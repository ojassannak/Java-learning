import java.util.List;

public class MergeSort {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid  = findMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    public ListNode merge(ListNode list1 , ListNode list2){
        ListNode dummy = new  ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            }else {
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            }
        }
        curr.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    public ListNode findMid(ListNode head){
//        if(head == null || head.next == null){
//            return  head;
//        }
//        ListNode slpw = head;
//        ListNode fast = head;
//
//         while(fast != null && fast.next != null){
//            slpw = slpw.next;
//            fast = fast.next.next;
//        }
//         return slpw;

        ListNode midPrev = null;

        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
