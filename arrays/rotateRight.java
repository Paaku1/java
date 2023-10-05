package arrays;

public class rotateRight {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotRight(arr, arr.length, d);
    }

    public static void rotRight(int[] arr, int n, int d) {
        int p = 0;
        int first;
        while (p != d) {
            first = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = first;
            p++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
