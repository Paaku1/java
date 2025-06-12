import java.util.Arrays;

public class BiSearch {
    public static String multiply(String num1, String num2) {
        int n1 = convertNum(num1);
        int n2 = convertNum(num2);
        return String.valueOf(n1 * n2);
    }

    private static int convertNum(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n = n * 10 + (s.charAt(i) - '0');
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 4, 4, 5, 6 };
        // System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(convertNum("53"));
    }
}
