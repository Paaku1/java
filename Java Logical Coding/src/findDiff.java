public class findDiff {
    public static void main(String[] args) {
        String s = "hello";
        String t = "helloa";
        int n = s.length();
        int sum = 0;
        for (char i : t.toCharArray()) {
            sum += i;
        }
        for (int i = 0; i < n; i++) {
            sum -= s.charAt(i);
        }
        System.out.println((char)sum);
    }
}