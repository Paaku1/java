package cp;

import java.util.*;
import java.lang.Math;

public class vigenere {
    static String generateKey(String key, String txt) {
        int x = txt.length();
        for (int i = 0;; i++) {
            if (x == i)
                i = 0;
            if (key.length() == x)
                break;
            key += key.charAt(i);
        }
        return key;
    }

    static String cipherTxt(String key, String txt) {
        StringBuffer c = new StringBuffer();
        for (int i = 0; i < txt.length(); i++) {
            int x = (txt.charAt(i) + key.charAt(i)) % 26;
            char ch = (char) (x + 'A');
            c.append(ch);
        }
        return c.toString();
    }

    static String plainTxt(String key, String txt) {
        StringBuffer c = new StringBuffer();
        for (int i = 0; i < txt.length(); i++) {
            int x = (Math.abs(txt.charAt(i) - key.charAt(i) + 26))%26;
            char ch = (char) (x + 'A');
            c.append(ch);
        }
        return c.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter Plain Txt: ");
            String txt = sc.nextLine().toUpperCase();
            System.out.println("Enter Key :");
            String key = sc.nextLine().toUpperCase();

            key = generateKey(key, txt);
            String c = cipherTxt(key, txt);
            System.out.println("Encrypted Cipher text: " + c);
            System.out.println("Decrypted Plain Text: " + plainTxt(key, c));
            
        }
    }
}