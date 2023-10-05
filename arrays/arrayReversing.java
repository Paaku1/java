package arrays;

public class arrayReversing {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int l = 0, t;
        int r = a.length - 1;
        while (l < r) {
            t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
