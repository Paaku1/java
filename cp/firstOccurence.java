public class firstOccurence {
    static void printArray(int[] arr, int size, int i, int x) {
        if (i >= size || x == 0)
            return;
        if (x == arr[i]) {
            System.out.println(i);
            size = i;
        }
        printArray(arr, size, ++i, x);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 7, 3 };
        printArray(arr, arr.length, 0, 5);
    }
}
