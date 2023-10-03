public class recursion {

    public static int fact(int a) {
        if (a == 1) {
            return 1;
        }
        if (a == 2) {
            return 2;
        }
        return a * fact(a - 1);
    }

    public static void main(String[] args) {
        int a = 7;
        System.out.println(fact(a));
    }
}
