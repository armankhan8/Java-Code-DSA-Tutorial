package DSA.LinnkedList.OtherQuestion;

public class Delete_NthNode_Last {
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

    public Node NthNodeDelete(int n){
        int size = 0;
        Node curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }

        int Nth = (size - n);
        if(Nth == 0){
            return head.next;
        }

        Node p = head;
        Node q = head.next;
        int i = 1;
        while (i != Nth){
            p = p.next;
            q = q.next;
            i++;
        }
        p.next = q.next;

        return head;

    }
    public static void main(String[] args) {
        Delete_NthNode_Last ll = new Delete_NthNode_Last();
        ll.CreatNode(1);
        ll.CreatNode(2);
        ll.CreatNode(3);
        ll.CreatNode(4);
        ll.CreatNode(5);
        ll.Display();
        ll.NthNodeDelete(2);
        ll.Display();
    }
    
}