public class factors {
    public static void main(String[] args) {
        int n = 150;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
