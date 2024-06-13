public class Triangle01 {
    public static void main(String[] args) {
        int ans = 0;
        for(int i = 1; i<=5; i++){
            ans = ans % 2 == 0 ? 1 : 0;
            for(int j = 1; j<=i; j++){
                System.out.print(ans);
                ans = 1 - ans;
            }
            System.out.println();
        }
    }
}
