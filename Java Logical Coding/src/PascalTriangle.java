public class PascalTriangle {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int res = fact(i) / (fact(i - j) * fact(j));
                System.out.print(" " + res);
            }
            System.out.println();
        }
    }

    private static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
}
