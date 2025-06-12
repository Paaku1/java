public class diamondPattern {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        String str = "PROBLEM";
        // for (int i = 0; i < str.length(); i++) {
        // for (int k = 0; k <= i; k++) {
        // System.out.print(str.charAt(k) + " ");
        // }
        // System.out.println();
        // }
        // System.out.println();
        // for (int i = str.length()-1; i >= 0 ; i--) {
        // for (int k = 0; k <= i; k++) {
        // System.out.print(str.charAt(k) + " ");
        // }
        // System.out.println();
        // }
        // for (int i = 0; i < str.length(); i++) {
        // for (int k = 0; k <= i; k++) {
        // System.out.print(str.charAt(k) + " ");
        // }
        // System.out.println();
        // }
        // for (int i = str.length()-2; i >= 0 ; i--) {
        // for (int k = 0; k <= i; k++) {
        // System.out.print(str.charAt(k) + " ");
        // }
        // System.out.println();
        // }
        int n = str.length();
        int i, j, k;
        // for (i = 0; i < n; i++) {
        // for (j = 2 * (n - i); j >= 0; j--) {
        // System.out.print(" ");
        // }
        // for (j = 0; j <= i; j++) {
        // System.out.print(str.charAt(j)+" ");
        // }
        // System.out.println();
        // }
        int r = n;
        for (i = r; i >= 1; i--) {
            for (j = r; j > i; j--) {
                System.out.print(" "); // Prints Blank space
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*"); // Prints *
            }
            System.out.println(" "); // Prints blank spaces
        }
    }
}
