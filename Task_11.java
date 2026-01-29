class Task_11 {
    public ListNode middleNode(ListNode head) {
        // Initialize two pointers, both starting at the head
        ListNode slow = head;
        ListNode fast = head;
        
        // Traverse the list: slow moves 1 step, fast moves 2 steps
        // The loop continues as long as fast hasn't reached the end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // When fast reaches the end, slow is exactly at the middle
        return slow;
    }
}

