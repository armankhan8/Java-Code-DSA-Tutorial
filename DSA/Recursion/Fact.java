package DSA.Recursion;

import java.util.Scanner;

public class Fact {
    public static int Factorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
        }
        int fact = 1;
        for(int i = n; i>=1; i--){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Factorial: " + Factorial(n));

    }
    
}
