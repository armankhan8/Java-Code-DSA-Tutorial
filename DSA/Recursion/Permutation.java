package DSA.Recursion;

public class Permutation {
    public static void PrintAllPerm(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
        }
        // Time Complexity --> O(n!);
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            PrintAllPerm(newStr, permutation+curr);

        }
    }
    public static void main(String[] args) {
        String str = "aabcb";
        PrintAllPerm(str, "");
        
    }
    
}
