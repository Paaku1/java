public class fibo {

    public static int fibonacci(int x) {
        if (x <= 1) {
            return x;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
