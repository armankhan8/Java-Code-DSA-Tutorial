package DSA.QueueDS.CircularArray;

public class Operation {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1) % size == front;
        }

        public static void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is Full!!");
                return;
            }
            // 1st Element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            int res = arr[front];
            // Single element in queue
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1) % size;
            }

            return res;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println(q.remove());
        q.enqueue(6);
        System.out.println(q.remove());
        q.enqueue(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
