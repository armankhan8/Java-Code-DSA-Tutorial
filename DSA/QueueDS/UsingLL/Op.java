package DSA.QueueDS.UsingLL;


import DSA.QueueDS.UsingLL.Op.Node.Queue;

public class Op {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        static class Queue {
            static Node head = null;
            static Node tail = null;

            public static boolean isEmpty() {
                return head == null && tail == null;
            }

            public static void enqueue(int data) {
                Node newNode = new Node(data);

                if (tail == null) {
                    tail = head = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;
            }

            public static int remove() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return -1;
                }
                int front = head.data;
                if (head == tail) {
                    tail = null;
                }
                head = head.next;
                return front;
            }

            public static int peek() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return -1;
                }
                return head.data;
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
}
