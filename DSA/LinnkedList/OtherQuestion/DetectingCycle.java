package DSA.LinnkedList.OtherQuestion;

public class DetectingCycle {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void CreatNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        DetectingCycle lop = new DetectingCycle();
        lop.CreatNode(1);
        lop.CreatNode(2);
        lop.CreatNode(3);
        lop.CreatNode(4);
        lop.CreatNode(5);
        lop.CreatNode(6);
        lop.Display();
    }
}
