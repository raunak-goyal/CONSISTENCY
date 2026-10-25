
import java.util.*;

public class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        tail.next = (a != null) ? a : b;
        return dummy.next;
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

        int n = sc.nextInt();
        Node a = createList(sc, n);

        int m = sc.nextInt();
        Node b = createList(sc, m);

        Node result = merge(a, b);

        while (result != null) {
            System.out.print(result.data);
            if (result.next != null) System.out.print(" ");
            result = result.next;
        }

        sc.close();
    }
}
