import java.util.Scanner;

public class LongestCommonPrefix {
    /*public static void main(String[] args) {
        String[] str = {"apple", "application", "appliance"};
        System.out.println(longestCommonPrefix(str));
    }*/

    private static String longestCommonPrefix(String[] str) {
        String res = "";
        String first = str[0];
        String last = str[str.length-1];
        for (int i = 0; i < first.length(); i++) {
            if(first.charAt(i)!=last.charAt(i)){
                return res;
            }
            res += first.charAt(i);
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine(); 
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = scanner.next().toLowerCase();
        }
        if (size == 0) {
            System.out.println("");
            return;
        }
        String prefix = names[0];
        for (int i = 1; i < size; i++) {
            prefix = findCommonPrefix(prefix, names[i]);
            if (prefix.isEmpty()) {
                break;
            }
        }
        System.out.println(prefix);
    }
    private static String findCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        int i = 0;
        while (i < minLength && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return str1.substring(0, i);
    }
}
