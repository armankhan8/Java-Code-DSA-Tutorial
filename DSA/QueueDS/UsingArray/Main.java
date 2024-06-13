package DSA.QueueDS.UsingArray;
public class Main {
    static class Queue {
        static int arr[];
        static int size;
        static int f;
        static int r;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
            this.f = 0;
            this.r = -1;
        }

        public static boolean isEmpty() {
            return f > r;
        }

        public static boolean isFull() {
            return r == size - 1;
        }

        public static void enqueue(int val) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            arr[++r] = val;
        }

        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f++];
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
