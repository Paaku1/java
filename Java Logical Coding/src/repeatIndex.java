import java.util.*;

public class repeatIndex {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    StringBuilder str = new StringBuilder(s.next());
    int n = str.length();
    s.close();
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (int i = 0; i < n; i++) {
      char c = str.charAt(i);
      if (charCount.containsKey(c)) {
        charCount.put(c, charCount.get(c) + 1);
      } else {
        charCount.put(c, 1);
      }
    }
    for (int i = 0; i < n; i++) {
      char c = str.charAt(i);
      if (charCount.get(c) == 1) {
        System.out.print(i + 1 + " ");
      }
    }
  }
}