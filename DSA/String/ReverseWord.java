package DSA.String;

public class ReverseWord {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        int start = 0, end = words.length - 1;
        while (start < end) {
            String t = words[start];
            words[start] = words[end];
            words[end] = t;
            start++;
            end--;
        }
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
