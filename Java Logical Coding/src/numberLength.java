public class numberLength {
    public static void main(String[] args) {
        int number = 1234567890;
        System.out.println(findLength(number));
        System.out.println((int) Math.log10(number) + 1);
    }

    private static int findLength(int n) {
        int c = 0;
        while (n > 0) {
            n /= 10;
            c++;
        }
        return c;
    }
}
