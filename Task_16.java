class Task_16 {
    public ListNode reverseKGroup(ListNode head, int k) {
        // 1. Check if there are at least k nodes left
        ListNode curr = head;
        int count = 0;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        // 2. If we have k nodes, reverse them
        if (count == k) {
            ListNode reversedHead = reverse(head, k);
            // 3. Recursively call for the rest and connect
            head.next = reverseKGroup(curr, k);
            return reversedHead;
        }

        // 4. Fewer than k nodes left, return head as is
        return head;
    }

    // Helper to reverse first k nodes
    private ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        while (k > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        return prev;
    }
}
