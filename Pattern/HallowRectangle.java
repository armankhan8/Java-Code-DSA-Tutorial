public class HallowRectangle {
    public static void main(String[] args) {
        int n = 5; // number of rows
        int m = 5; // number of columns
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Print '*' for the borders and corners of the rectangle
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
