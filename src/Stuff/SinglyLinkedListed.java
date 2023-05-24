package Stuff;

public class SinglyLinkedListed {
    private Node head;

    public SinglyLinkedListed() {
        this.head = null;
    }

    public void addElement(int e) {
        Node newNode;
        if (head == null) {
            newNode = new Node(e, null);
            head = newNode;
        } else {
            newNode = new Node(e, head);
            head = newNode;
        }
    }

    public Node removeFirst() {
        Node deleted = head;
        head = head.next;
        return deleted;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getHeadInt() {
        return head.data;
    }
    class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data + "";
        }
    }
}
