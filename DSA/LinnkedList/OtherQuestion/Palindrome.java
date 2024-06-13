package DSA.LinnkedList.OtherQuestion;

public class Palindrome {

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

    public Node Reversee(Node newH){
        Node prev = null;
        Node temp = null;
        Node curr = newH;

        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }


    public boolean CheckPalindrome(){
        Node slow = head;
        Node fast = head;

        // Middle Find
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse 2ndhalf
        Node newHead = Reversee(slow.next);

        Node firstHead = head;
        while(newHead!=null){
            if(firstHead.data != newHead.data){
                return false;
            }
            firstHead = firstHead.next;
            newHead = newHead.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome pal_ll = new Palindrome();
        pal_ll.CreatNode(1);
        pal_ll.CreatNode(2);
        pal_ll.CreatNode(3);
        pal_ll.CreatNode(3);
        pal_ll.CreatNode(2);
        pal_ll.CreatNode(1);

        pal_ll.Display();
        System.out.println(pal_ll.CheckPalindrome());
    }
}
