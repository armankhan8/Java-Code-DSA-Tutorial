package DSA.LinnkedList.circular;

public class AllOp {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Circular reference to itself
            return;
        }
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head; // Make the new node part of the circular loop
    }

    public void AddAfterNode(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void PrintList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        do {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        } while (currNode != head);
        System.out.println(); // New line after printing the list
    }

    public static void main(String[] args) {
        AllOp list = new AllOp();
        list.AddFirst(0);
        list.AddLast(1);
        list.AddLast(2);
        list.AddAfterNode(list.head.next, 4); // Inserts 4 after the second node (1)
        list.PrintList(); // Output: 0 3 1 4 2
    }
}
