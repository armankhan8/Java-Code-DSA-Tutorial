package DSA.Recursion;

public class Fibonacci {
    public static void Fib(int first, int second, int size) {
        if (size == 0) {
            return;
        }
        int third = first + second;
        System.out.print(third + " ");
        Fib(second, third, size - 1);

    }

    public static int CalFib(int size) {
        // Base cases
        if (size == 0) {
            return 0;
        } else if (size == 1) {
            return 1;
        }
        // Recursive case
        int s = CalFib(size - 1);
        int t = CalFib(size - 2);
        return s + t;
    }

    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.print(first + " ");
        System.out.print(second);
        int size = 10;
        // Fib(first, second, size - 2);
        System.out.println(CalFib(size));
    }
}
