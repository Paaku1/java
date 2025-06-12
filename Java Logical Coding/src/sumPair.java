import java.util.Arrays;

public class sumPair {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 10, 6, 7, 8, 9 };
        int k = 5;
        System.out.println(canArrange(arr, k));
    }

    public static boolean canArrange(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int c = 0;
        System.out.println(Arrays.toString(arr));
        while (i < j) {
            if (arr[i] + arr[j] % k == 0) {
                c++;
                j--;
            }
            i++;
        }
        System.out.println(c);
        return arr.length / 2 == c;
    }
}
