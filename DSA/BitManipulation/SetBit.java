package DSA.BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMusk = 1 << pos;

        // if((bitMusk | n) == 0){
        //     System.out.println("Bit Was Zero");
        // }else{
        //     System.out.println("Bit was One");
        // }
        int newNm = bitMusk | n;
        System.out.println(newNm);
    }
}
