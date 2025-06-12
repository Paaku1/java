import java.util.*;

public class repeatedNum {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 4, 1, 2, 8 };
        int[] arr = { -1, 0, 0, 0, 0, 0, 0, -1 };
        // int[] arr = { -1, -2, -3, -4, -5};
        int n = arr.length;
        int res = findRepArray(arr, n);
        System.out.println(res);
    }

    public static int findRepArray(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        boolean hasNum = false;
        for (int i : arr) {
            if (i > 0) {
                hasNum = true;
                if (set.contains(i)) {
                    return i;
                }
                set.add(i);
            }
        }
        int res = hasNum ? arr[0] : 0;
        return res;
    }
}
