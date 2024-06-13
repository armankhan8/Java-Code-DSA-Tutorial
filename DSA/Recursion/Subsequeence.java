package DSA.Recursion;

public class Subsequeence {
    public static void Subs(String str, int ind, String newStr){
        // Tc --> O(2^n)
        if(ind == str.length()){
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(ind);
        Subs(str, ind+1, newStr+curr);
        Subs(str, ind+1, newStr);
    }
    public static void main(String[] args){
        String str = "aabcb";
        Subs(str, 0, "");
    }
    
}
