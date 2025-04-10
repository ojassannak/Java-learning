public class CycleQuestion {
    //https://leetcode.com/problems/linked-list-cycle/
    //Amazon and Microsoft
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    // Q: Find the length of the cycle
    public int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                //calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
               length = lengthOfCycle(slow);
            }
        }

        ListNode f = head;
        ListNode s = head;
        while (length > 0){
            s = s.next;
            length--;
        }

        while (f != s){
            f = f.next;
            s = s.next;
        }
        return slow;
    }

    //https://leetcode.com/problems/happy-number/description/
    public boolean isHappy(int n) {
     int fast = n;
     int slow = n;

      do {
          slow = findSquare(slow);
          fast = findSquare(findSquare(fast));
      }while (slow != fast);

      if (slow == 1){
          return true;
      }
      return false;
    }

    private int findSquare(int num){
        int ans = 0;

        while (num > 0){
            int rem  = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    //https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        ListNode fast  = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // In place reversal of linked list
    //https://leetcode.com/problems/reverse-linked-list/description/ google, microsoft , apple
    public ListNode reverseList(ListNode head){
        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while (pres != null){
            pres.next = prev;
            prev = pres; //Move ahead in position of pres
            pres = next; // move ahead in position of nest;
            //null pointer check
            if (next != null){
                next = next.next;
            }
        }
        return prev;
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

    //https://leetcode.com/problems/reverse-nodes-in-k-group/description/
    //google, amazon, facebook, microsoft
    //it also reversing the < k end item -> modify it accordingly
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k < 1 || head == null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (true){
            ListNode last = prev;
            ListNode newEnd = current;

            //reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null  && i < k; i++) {
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

            if (current == null){
                break;
            }
            prev = newEnd;
        }
        return head;
    }

    //https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if(k < 1 || head == null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (current != null){
            ListNode last = prev;
            ListNode newEnd = current;

            //reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null  && i < k; i++) {
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

           //skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }


    // linkedin, google , facebook , microsoft , apple , amazon
    //https://leetcode.com/problems/palindrome-linked-list/
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head); //find middle of the list
        ListNode secondHead = reverseList(mid); // reverse the list from middle
        ListNode rereverseHead = secondHead;

        //compare both the half
        while (head != null && secondHead != null){
            if(head.val != secondHead.val){
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }

        reverseList(rereverseHead); //reverse the list back to normal state
        return head == null || secondHead == null;
    }

    //https://leetcode.com/problems/reorder-list/
    //Google  Facebook
    public void reorderList(ListNode head) {
        if (head == null || head.next == null){
            return;
        }

        ListNode mid = middleNode(head);

        ListNode hs = reverseList(mid);
        ListNode hf  = head;

        //rearrange
        while (hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        //next of tail to null
        if (hf != null){
            hf.next = null;
        }
    }

    //https://leetcode.com/problems/rotate-list/description/ facebook, Twitter, google
    public ListNode rotateRight(ListNode head, int k) {
        if (k < 0 || head == null || head.next ==null){
            return  head;
        }

        ListNode last = head;
        int length = 1;
        while (last != null){
            last = last.next;
            length++;
        }

        last.next = head;
        int roatations = k % length;
        int skip = length - roatations;
        ListNode newLast = head;
        for (int i = 0; i < skip - 1 ; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }
}


    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
          val = x;
        next = null;
      }
}

