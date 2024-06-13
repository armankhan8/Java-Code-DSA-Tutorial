package DSA.Recursion;

public class RemoveDuplicate {
    public static boolean[] map = new boolean[26];
    public static void Remove(String str, int ind, String newStr){
        if(ind == str.length()){
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(ind);
        if(map[curr-'a'] == true){
            Remove(str, ind+1, newStr);
        }else{
            newStr += curr;
            map[curr - 'a'] = true;
            Remove(str, ind+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "bcabc";
        Remove(str, 0, "");
    }
    
}
