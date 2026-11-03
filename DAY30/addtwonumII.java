import java.util.*;

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        Map<Integer, ListNode> map = new HashMap<>();
        int prefixSum = 0;

        for (ListNode curr = dummy; curr != null; curr = curr.next) {
            prefixSum += curr.val;
            map.put(prefixSum, curr);
        }

        prefixSum = 0;

        for (ListNode curr = dummy; curr != null; curr = curr.next) {
            prefixSum += curr.val;
            curr.next = map.get(prefixSum).next;
        }

        return dummy.next;
    }
}