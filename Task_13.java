class Task_13 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node acts as the starting point of the merged list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Compare elements from both lists while they aren't empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining nodes from whichever list isn't empty
        tail.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}

