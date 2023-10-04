public class lastOccurrence {

    public static int lastOcc(int[] a, int size, int i, int x) {
        if (i == 0) {
            return -1;
        }
        if (a[i] == x) {
            return i;
        }
        return lastOcc(a, size, --i, x);
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 7, 4, 3, 7, 5 };
        int x = lastOcc(a, a.length, a.length - 1, 7);
        System.out.println(x);
    }
}
