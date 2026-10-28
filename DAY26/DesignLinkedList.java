
class MyLinkedList {
    private static class Node {
        int val;
        Node prev, next;

        Node(int val) {
            this.val = val;
        }
    }

    private final Node head;
    private final Node tail;
    private int size;

    public MyLinkedList() {
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) return null;

        Node current;
        if (index < size / 2) {
            current = head.next;
            for (int i = 0; i < index; i++)
                current = current.next;
        } else {
            current = tail.prev;
            for (int i = size - 1; i > index; i--)
                current = current.prev;
        }
        return current;
    }

    public int get(int index) {
        Node node = getNode(index);
        return node == null ? -1 : node.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) index = 0;
        if (index > size) return;

        Node next;
        if (index == size) {
            next = tail;
        } else {
            next = getNode(index);
        }

        Node prev = next.prev;
        Node node = new Node(val);

        prev.next = node;
        node.prev = prev;
        node.next = next;
        next.prev = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        Node node = getNode(index);
        if (node == null) return;

        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }
}
