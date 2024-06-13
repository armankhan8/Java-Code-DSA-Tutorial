package DSA.Recursion;

public class FirstAndLastOcc {
    public static void Occurence(String str){
        int first = -1;
        int last = -1;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'a'){
                if(first == -1){
                    first = i;
                }else{
                    last = i;
                }
            }
        }
        System.out.println(first + " " + last);
        System.out.println(str.length());
    }
    public static void main(String[] args) {
        String str = "aaabbbaabbaa";
        Occurence(str);
    }
    
}
