public class Task_17 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Determine if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) { // Cycle detected
                // Phase 2: Find the entry point of the cycle
                ListNode ptr1 = head;
                ListNode ptr2 = slow;
                
                while (ptr1 != ptr2) {
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                return ptr1; // Both meet at the start of the cycle
            }
        }

        return null; // No cycle found
    }
}
