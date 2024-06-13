package DSA.Array_List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Operation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add op
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(list);

        // get using index
        System.out.println(list.get(0));

        // add in between
        list.add(1, 6);
        list.add(3, 6);
        list.add(4, 6);

        System.out.println(list);

        // set element on index 
        System.out.println(list.set(0, 10));
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());


        // Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
