package CIS;
import java.util.*;
//1A
public class caesarCipher {
    public static String encrypt(String s, int k){
        StringBuffer r = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c = (char)((int) ((s.charAt(i)+k)-65)%26 + 65 );
            r.append(c);
        }
        return r.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plain Text: ");
        String s = sc.nextLine().toUpperCase();
        System.out.println("Enter key: ");
        int k = sc.nextInt();
        System.out.println("Encrypted Text: "+encrypt(s, k));
        sc.close();
    }
}
