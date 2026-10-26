
import java.util.*;

public class Main {
    static class Node {
        int data;
        Node next;

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
                tail = node;
            }
        }

        int key = sc.nextInt();

        if (head != null && head.data == key) {
            head = head.next;
        } else {
            Node current = head;

            while (current != null && current.next != null) {
                if (current.next.data == key) {
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" ");
            current = current.next;
        }

        sc.close();
    }
}
