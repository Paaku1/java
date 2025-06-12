import java.util.*;

public class SortedOccurrence {

    public static Map<Character,Integer> getWordCount(String str) {
        Map<Character, Integer> wordCount = new TreeMap<>();
        for (char c : str.toCharArray()) {
            if(c != ' ') {
                wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
            }
        }
        return wordCount;
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(getWordCount(str));
    }
}
