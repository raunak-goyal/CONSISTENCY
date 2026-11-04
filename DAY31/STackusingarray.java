import java.util.*;

class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " pushed");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(stack[top--] + " popped");
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top: " + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();
        ArrayStack s = new ArrayStack(capacity);

        while (sc.hasNextInt()) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Operation");
            }
        }

        sc.close();
    }
}