public class bitcount {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Integer.bitCount(n));
        System.out.println(bitCount(n, 0));
    }

    private static int bitCount(int n, int c) {
        if (n == 0)
            return c;
        return bitCount(n / 2, n % 2 + c);
    }

}