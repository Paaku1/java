import java.util.*;

public class firstOcc {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == 1) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(map);
    }
}
