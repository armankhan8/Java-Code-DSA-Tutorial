package DSA.TrieDS;

public class BuildBT_Question {

    static class Node {
        Node children[];
        boolean endOfWord;

        public Node() {
            children = new Node[26]; // a to z
            endOfWord = false;
        }
    }

    static Node root = new Node();

    public static void InsertNode(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';
            if (curr.children[ind] == null) {
                // Add new node
                curr.children[ind] = new Node();
            }
            curr = curr.children[ind];
        }
        // Mark the end of the word
        curr.endOfWord = true;
    }

    public static boolean Search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int ind = key.charAt(i) - 'a';
            if (curr.children[ind] == null) {
                return false;
            }if(i == key.length()-1 && curr.children[ind].endOfWord == false){
                return false;
            }
            curr = curr.children[ind];
        }
        return true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i = 1; i<=key.length(); i++){
            String firstP = key.substring(0, i);
            String secondP = key.substring(i);

            if(Search(firstP) && wordBreak(secondP)){
                return true;
            }
        }
        return false;
    }

    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i = 0; i<prefix.length(); i++){
            int ind = prefix.charAt(i) - 'a';
            if(curr.children[ind] == null){
                return false;
            }
            curr = curr.children[ind];
        }
        return true;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i<26; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        // String words[] = { "the", "a", "there", "their", "any" };
        // for (int i = 0; i < words.length; i++) {
        //     InsertNode(words[i]);
        // }

        // System.out.println(Search("thor"));  // false
        // System.out.println(Search("any"));   // true
        // System.out.println(Search("there")); // true
        
        // String key = "theathere";
        // System.out.println(wordBreak(key));

        // System.out.println(startWith("theee"));



        String st = "ababa";
        for(int i = 0; i<st.length(); i++){
            String suffix = st.substring(i);
            InsertNode(suffix);
            // System.out.println(suffix);
        }

        System.out.println(countNode(root));
    }
}
