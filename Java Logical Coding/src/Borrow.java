public class Borrow {
    public static void main(String[] args) {
        int a = 707;
        int b = 618;
        int count = 0;
        boolean carry = false;
        if (a < b) {
            System.out.println("Not Possible");
            } else {
            while (a > 0 && b > 0) {
                int r1 = a % 10;
                int r2 = b % 10;
                    if (r1 == 0) {
                        r1 = 9;
                    } else {
                if (r1 < r2) {
                    }
                    r1 = r1 == 0 ? 9 : r1 - 1;
                }
                if (r1 < r2) {
                    carry = true;
                    count++;
                }
                a /= 10;
                b /= 10;
            }
        }
        System.out.println(count);
    }
}
