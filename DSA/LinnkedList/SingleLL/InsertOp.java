package DSA.LinnkedList.SingleLL;

public class InsertOp {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void AddFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void LastAdd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next!=null){
            currNode = currNode.next;

        }
        currNode.next = newNode;
    }
    public void AddBetween(int data, int index){
        Node newNode = new Node(data);
        int i = 0;
        Node p = head;
        Node q = head.next;

        while(i!=index-1){
            p = p.next;
            q = q.next;
            i+=1;
        }
        newNode.next = q;
        p.next = newNode;

    }
    public void pushNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void PrintLis(){
        Node currNode = head;
        while (currNode!=null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        InsertOp list = new InsertOp();
        // list.AddFirst(0);
        // list.AddFirst(1);
        // list.PrintLis();
        // list.LastAdd(2);
        // list.LastAdd(3);
        list.pushNode(0);
        list.pushNode(1);
        list.pushNode(2);
        list.pushNode(3);
        list.pushNode(4);
        list.AddBetween(5, 2);
        list.PrintLis();
    }

}
