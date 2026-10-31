
import java.util.*;

public class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        Node tail = head;
        int length = 1;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k %= length;
        if (k == 0) return head;

        tail.next = head; // Make circular.

        int stepsToNewTail = length - k;
        Node newTail = tail;

        while (stepsToNewTail-- > 0) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            Node node = new Node(sc.nextInt());

            if (head == null) head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
        }

        int k = sc.nextInt();
        head = rotateRight(head, k);

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        sc.close();
    }
}
