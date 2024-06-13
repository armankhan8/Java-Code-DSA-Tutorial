package DSA.Hash;
import java.util.HashSet;
import java.util.Iterator;

public class HashhSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);


        // Search
        if(set.contains(1)){
            System.out.println("Yes");
        } if (!set.contains(6)){
            System.out.println("No");
        }
        System.out.println(set.size());
        set.remove(1);
        System.out.println(set);


        // Iteratorr
        Iterator it = set.iterator();

        // hasnext return true or false
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
