package DSA.BitManipulation;

public class Get {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMusk = n << pos;

        if((bitMusk & n) == 0){
            System.out.println("Bit Was Zero");
        }else{
            System.out.println("Bit was One");
        }
    }
}
