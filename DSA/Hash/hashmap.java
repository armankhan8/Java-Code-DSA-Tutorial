package DSA.Hash;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("China", 20);

        System.out.println(map);
        map.put("China", 1);
        // value update ho jayegi

        System.out.println(map);

        // Search
        if(map.containsKey("India")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // If exit in the map 
        System.out.println(map.get("India"));

        // If not exit in the map 
        System.out.println(map.get("map"));

        // Print one way    
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // Print 2nd way 
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+ " " + map.get(keys));
        }

        map.remove("India");
        System.out.println(map);
    } 
}
