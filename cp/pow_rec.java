public class pow_rec {

    public static int pow(int a, int b) {
        if (b != 0) {
            return a * pow(a, b - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(-5, 6));
    }
}
