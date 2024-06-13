package DSA.Recursion;

public class TotalPathMatrixZeroToLast {
    public static int PrintAllPath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        // Downward Move
        int DownPath = PrintAllPath(i+1, j, n, m);
        // RightMove
        int rightPath = PrintAllPath(i, j+1, n, m);
        return DownPath + rightPath;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalP = PrintAllPath(0, 0, n ,m);
        System.out.println(totalP);

    }
    
}
