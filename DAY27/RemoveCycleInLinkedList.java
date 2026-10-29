
class Solution {
    public static void removeLoop(Node head) {
        if (head == null) return;

        Node slow = head, fast = head;
        boolean cycleFound = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycleFound = true;
                break;
            }
        }

        if (!cycleFound) return;

        // Find the start of the cycle.
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        Node cycleStart = slow;
        Node current = cycleStart;

        // Find the last node in the cycle.
        while (current.next != cycleStart) {
            current = current.next;
        }

        current.next = null;
    }
}
