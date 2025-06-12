public class fibonacci {
    static long fibon(int input1) {
        int first = 0, second = 1, temp;
        if (input1 == 0) {
            return first;
        }
        if (input1 == 1) {
            return second;
        }
        for (int i = 1; i < input1; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        // System.out.println(fibon(5));
        // System.out.println(fibo(5));
        for (int i = 0; i <= 5; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(fibon(i) + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(dpFibo(i) + " ");
        }
        System.out.println();
    }

    private static int dpFibo(int n) {
        int[] dp = new int[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
