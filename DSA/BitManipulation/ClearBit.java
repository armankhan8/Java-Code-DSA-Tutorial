package DSA.BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMusk = 1 << pos;
        int notBitm = ~(bitMusk);

        int newNm = notBitm & n;
        System.out.println(newNm);
    }
}
