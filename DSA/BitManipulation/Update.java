package DSA.BitManipulation;

import java.util.Scanner;

public class Update{
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        int bitMusk = 1<<pos;
        if(op == 1){
            int newNum = bitMusk | n;
            System.out.println(newNum);
        }else{
            int newbitmast = ~(bitMusk);
            int newN = newbitmast & n;
            System.out.println(newN);
        }
    }
}
