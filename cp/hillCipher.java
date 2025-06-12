package cp;

import java.util.*;

public class hillCipher {
    public static void main(String[] args) {
        int[][] a = { { 17, 17, 5 }, { 21, 18, 21 }, { 2, 2, 19 } };
        int[][] b = { { 4, 9, 15 }, { 15, 17, 6 }, { 24, 0, 17 } };

        int[] c = new int[20];
        int[] d = new int[20];
        char[] msg;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter plain text: ");
        msg = scanner.nextLine().toUpperCase().toCharArray();

        int n = msg.length;

        for (int i = 0; i < n; i++) {
            c[i] = msg[i] - 65;
            System.out.print(c[i] + " ");
        }

        for (int i = 0; i < 3; i++) {
            int t = 0;
            for (int j = 0; j < 3; j++) {
                t = t + (c[j] * a[j][i]);
            }
            d[i] = t % 26;
        }

        System.out.print("\nEncrypted Cipher Text: ");
        for (int i = 0; i < 3; i++)
            System.out.print((char) (d[i] + 65) + " ");

        for (int i = 0; i < 3; i++) {
            int t = 0;
            for (int j = 0; j < 3; j++) {
                t = t + (d[j] * b[j][i]);
            }
            c[i] = t % 26;
        }

        System.out.print("\nDecrypted Cipher Text: ");
        for (int i = 0; i < 3; i++)
            System.out.print((char) (c[i] + 65) + " ");

        scanner.close();
    }
}
