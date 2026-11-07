import java.util.*;

class ArrayStack {
    int[] arr;
    int top;
    int capacity;

    ArrayStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + arr[top--]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        ArrayStack stack = new ArrayStack(size);

        int operations = sc.nextInt();

        for (int i = 0; i < operations; i++) {
            int choice = sc.nextInt();

            if (choice == 1) {
                stack.push(sc.nextInt());
            } else if (choice == 2) {
                stack.pop();
            } else if (choice == 3) {
                stack.display();
            }
        }

        sc.close();
    }
}