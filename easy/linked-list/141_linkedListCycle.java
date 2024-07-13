public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            
            head = head.next;
            if(fast == head) return true;
            
        }
            
        return false;
        
    }
}

// 07/13/24 30min
//
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        if (head.next == null)
            return false;

        ListNode fast = head.next.next;

        while (head.next != null) {
            // fast can either be null, or .next.next
            if (head == fast)
                return true;
            if (fast == null)
                return false;
            head = head.next;
            if (fast.next != null)
                fast = fast.next.next;
        }
        return false;
    }
}
