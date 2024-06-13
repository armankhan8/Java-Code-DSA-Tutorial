package DSA.LinnkedList.ByCollectionFrameWork;
import java.util.*;

public class LinkedLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("A");
        list.addFirst("B");
        System.out.println(list);

        list.addLast("C");
        list.addLast("D");
        System.out.println(list);

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        list.removeFirst();
        System.out.println(list);
    }
    
}
