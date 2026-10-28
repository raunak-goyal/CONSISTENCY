
import java.util.*;

public class Main {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            Node node = new Node(sc.nextInt());

            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();

        current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }

        sc.close();
    }
}
