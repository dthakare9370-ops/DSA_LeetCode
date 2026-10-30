import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a.val,b.val)
        );

        for(int i = 0; i < lists.length; i++) {
            if(lists[i] != null) {
                pq.add(lists[i]);
            }
        }

        ListNode head = new ListNode(0);
        ListNode temp = head;

        while(!pq.isEmpty()) {

            ListNode node = pq.poll();

            temp.next = node;
            temp = temp.next;

            if(node.next != null) {
                pq.add(node.next);
            }
        }

        temp.next = null;

        return head.next;
    }
}