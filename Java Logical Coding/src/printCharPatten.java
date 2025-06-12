public class printCharPatten {
    public static void main(String[] args) {
        patten(5);
    }

    private static void patten(int n) {
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                char c = k % 2 == 0 ? 'A' : 'a';
                System.out.print((char) (c + k++));
            }
            System.out.println();
        }
    }
}
