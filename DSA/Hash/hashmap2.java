package DSA.Hash;

import java.util.ArrayList;
import java.util.LinkedList;

public class hashmap2 {
    static class HashMap<K, V>{
        private class Node{
            K key;  
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // n --> Nodes
        private int N; // N --> Bucket
        private LinkedList<Node> buckets[];

        // @SuppressWarnings("Warning");
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i = 0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFun(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];

            for(int i = 0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }

            return -1;
        }

        private void rehas(){
            LinkedList<Node> oldbucket[] = buckets;
            buckets =  new LinkedList[N*2];

            for(int i = 0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0; i<oldbucket.length; i++){
                LinkedList<Node> ll = oldbucket[i];
                for(int j =0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFun(key);
            int ind = searchInLL(key, bi);

            if(ind ==-1){ //key desmot exit
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                Node data = buckets[bi].get(ind);
                data.value = value;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0){
                // reshing
                rehas();
            }
        }

        public boolean containsKey(K key){
            int bi = hashFun(key);
            int ind = searchInLL(key, bi);

            if(ind ==-1){ //key desmot exit
                return false;
            }else{
                return true;
            }
        }


        public V remove(K key){
            int bi = hashFun(key);
            int ind = searchInLL(key, bi);

            if(ind ==-1){ //key desmot exit
                return null;
            }else{
                Node data = buckets[bi].get(ind);
                n--;
                return data.value;
            }
        }

        public V get(K key){
            int bi = hashFun(key);
            int ind = searchInLL(key, bi);

            if(ind ==-1){ //key desmot exit
                return null;
            }else{
                Node data = buckets[bi].get(ind);
                return data.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 200);
        map.put("China", 290);
        map.put("Us", 50);

        ArrayList<String> keys = map.keySet();
        for(int i = 0; i<keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
    }
}
