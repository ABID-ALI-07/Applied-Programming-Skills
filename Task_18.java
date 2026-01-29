public class Task_18 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Boundary check
        if (headA == null || headB == null) return null;

        ListNode pA = headA;
        ListNode pB = headB;

        // Traverse through the lists
        while (pA != pB) {
            // Once pA reaches the end of list A, redirect it to headB
            pA = (pA == null) ? headB : pA.next;
            
            // Once pB reaches the end of list B, redirect it to headA
            pB = (pB == null) ? headA : pB.next;
        }

        // Either they meet at the intersection node, or both are null (no intersection)
        return pA;
    }
}
