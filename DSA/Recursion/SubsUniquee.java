package DSA.Recursion;

import java.util.HashSet;

public class SubsUniquee {
    public static void Subs(String str, int ind, String newStr, HashSet<String> set){
        // Tc --> O(2^n)
        if(ind == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char curr = str.charAt(ind);
        Subs(str, ind+1, newStr+curr, set);
        Subs(str, ind+1, newStr, set);
    }
    public static void main(String[] args){
        String str = "aabcb";
        HashSet<String> set = new HashSet<>();
        Subs(str, 0, "", set);
    }
    
}
