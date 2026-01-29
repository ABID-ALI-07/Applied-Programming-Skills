import java.util.PriorityQueue;

class Task_14 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        // Min-Heap ordered by node value
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head of each non-empty list to the heap
        for (ListNode list : lists) {
            if (list != null) pq.add(list);
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            // Extract the smallest node
            ListNode smallest = pq.poll();
            tail.next = smallest;
            tail = tail.next;

            // If the extracted node has a next node, add it to the heap
            if (smallest.next != null) {
                pq.add(smallest.next);
            }
        }

        return dummy.next;
    }
}
