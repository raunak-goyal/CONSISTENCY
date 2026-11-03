import java.util.*;

class Node {
    int coeff, exp;
    Node next;

    Node(int coeff, int exp) {
        this.coeff = coeff;
        this.exp = exp;
    }
}

public class Main {

    static Node readPolynomial(Scanner sc) {
        int n = sc.nextInt();
        Node dummy = new Node(0, 0);
        Node tail = dummy;

        for (int i = 0; i < n; i++) {
            int coeff = sc.nextInt();
            int exp = sc.nextInt();

            tail.next = new Node(coeff, exp);
            tail = tail.next;
        }

        return dummy.next;
    }

    static Node addPolynomials(Node p1, Node p2) {
        Node dummy = new Node(0, 0);
        Node tail = dummy;

        while (p1 != null && p2 != null) {
            if (p1.exp == p2.exp) {
                int sum = p1.coeff + p2.coeff;

                if (sum != 0) {
                    tail.next = new Node(sum, p1.exp);
                    tail = tail.next;
                }

                p1 = p1.next;
                p2 = p2.next;
            } else if (p1.exp > p2.exp) {
                tail.next = new Node(p1.coeff, p1.exp);
                tail = tail.next;
                p1 = p1.next;
            } else {
                tail.next = new Node(p2.coeff, p2.exp);
                tail = tail.next;
                p2 = p2.next;
            }
        }

        while (p1 != null) {
            tail.next = new Node(p1.coeff, p1.exp);
            tail = tail.next;
            p1 = p1.next;
        }

        while (p2 != null) {
            tail.next = new Node(p2.coeff, p2.exp);
            tail = tail.next;
            p2 = p2.next;
        }

        return dummy.next;
    }

    static void printPolynomial(Node head) {
        if (head == null) {
            System.out.println("0");
            return;
        }

        while (head != null) {
            System.out.print("(" + head.coeff + "," + head.exp + ")");
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node p1 = readPolynomial(sc);
        Node p2 = readPolynomial(sc);

        Node result = addPolynomials(p1, p2);
        printPolynomial(result);

        sc.close();
    }
}