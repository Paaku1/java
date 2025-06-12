import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class alphabetCheck {

    public static char[] placeAlphabets(int[] input) {
        int n = input.length;
        char[] result = new char[n];
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (i1, i2) -> Integer.compare(input[i1], input[i2]));
        Map<Integer, Character> indexToChar = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexToChar.put(indices[i], (char) ('a' + i));
        }
        for (int i = 0; i < n; i++) {
            result[i] = indexToChar.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 0 };
        char[] output = placeAlphabets(input);
        System.out.println(Arrays.toString(output));

    }
}
