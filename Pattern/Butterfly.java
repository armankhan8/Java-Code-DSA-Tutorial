public class Butterfly {
    public static void main(String[] args) {
        int space;
        int n = 5; // Size of the butterfly wings

        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in between
            space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Right side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n-1; i >= 1; i--) {
            // Left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in between
            space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Right side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
