package DSA.LinnkedList.SingleLL;
public class DeletionOp {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void PrintAll(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("Null");
    }
    public void PushNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;

    }
    public Node DeleteFirst(){
        Node p = head;
        head = head.next;
        return head;
    }
    public void DeleteLast(){
        Node p = head;
        Node q = head.next;
        while(q.next != null){
            p = p.next;
            q = q.next;
        }
        p.next = q.next;
        p.next = null;
    }
    public static void main(String[] args) {
        DeletionOp ll = new DeletionOp();
        ll.PushNode(1);
        ll.PushNode(2);
        ll.PushNode(3);
        ll.PushNode(4);
        ll.PushNode(5);
        ll.PrintAll();
        ll.DeleteFirst();
        ll.DeleteLast();
        System.out.println();
        ll.PrintAll();
        
    }
}
