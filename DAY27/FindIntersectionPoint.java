
import java.util.*;

public class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node getIntersection(Node headA, Node headB) {
        Node a = headA, b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }

    static Node createList(Scanner sc, int n) {
        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            Node node = new Node(sc.nextInt());

            if (head == null) head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format: n, list A values, m, list B values.
        // This input format creates independent lists.
        int n = sc.nextInt();
        Node headA = createList(sc, n);

        int m = sc.nextInt();
        Node headB = createList(sc, m);

        Node intersection = getIntersection(headA, headB);

        System.out.println(intersection == null
                ? "No intersection"
                : intersection.data);

        sc.close();
    }
}
