package DSA.Recursion;

public class ReverseString {
    public static void RevString(String str, int ind){
        if(ind == 0){
            System.out.print(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        RevString(str, ind-1);
    }
    public static void main(String[] args) {
        String str = "Arman";
        RevString(str, str.length()-1);
    }
    
}
