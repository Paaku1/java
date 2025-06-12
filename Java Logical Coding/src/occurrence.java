import java.util.*;

public class occurrence {
    static int getMax(int[] a, int length) {
        Map<Integer, Integer> x = new HashMap<>();
        for (int i = 0; i < length; i++) {
            while (a[i] != 0) {
                int r = a[i] % 10;
                if (x.containsKey(r)) {
                    x.put(r, x.get(r) + 1);
                } else {
                    x.put(r, 1);
                }
                a[i] /= 10;
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> m : x.entrySet()) {
            if (m.getValue() > max) {
                max = Math.max(max,m.getKey());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = { 123, 2, 12354, 2356, 7758, 4543 };
        int x = getMax(a, a.length);
        System.out.println(x);
    }
}