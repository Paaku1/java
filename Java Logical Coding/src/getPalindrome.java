public class getPalindrome {
    public static void main(String[] args) {
        String s = "ioi";
        System.out.println(findPalindrome(s));
    }

    private static String findPalindrome(String s) {
        int n = s.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(s.substring(0, i));
            if (isPalindrome(s + sb.reverse())) {
                res = sb.toString();
                System.out.println(s + sb.reverse());
                break;
            }
        }
        return res;
    }

    private static boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length();
        while (i < j) {
            if (string.charAt(i) != string.charAt(j - 1)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
