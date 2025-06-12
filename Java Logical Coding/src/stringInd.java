import java.util.Scanner;

public class stringInd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        int c1 = s1.indexOf('*');
        int c2 = s1.indexOf('*');
        String r1 = s1.substring(c1, s1.length());
        String r2 = s2.substring(c2, s2.length());
        String res = (r1.equals(r2)) ? "True" : "False";
        System.out.println(res);
    }
}
