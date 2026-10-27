
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

        int target = sc.nextInt();
        int count = 0;

        Node current = head;
        while (current != null) {
            if (current.data == target) {
                count++;
            }
            current = current.next;
        }

        System.out.println(count);
        sc.close();
    }
}
