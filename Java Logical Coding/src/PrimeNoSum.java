import java.util.*;

public class PrimeNoSum {

    public static int findSumOfPrimes(int[] input1, int input2) {
        List<Integer> primes = new ArrayList<>();
        for (int num : input1) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        // change only this block
        if (primes.isEmpty()) {
            int sum = 0;
            Arrays.sort(input1);
            for(int i : input1){
                sum += i;
            }
            return sum -input1[0];
        }

        int smallestPrime = Collections.min(primes);
        int sum = 0;
        for (int prime : primes) {
            if (prime != smallestPrime) {
                sum += prime;
            }
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num != 2 && num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Example array input
        int[] input1 = { 10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67 };

        // Expected number of elements in the array (optional in this case)
        int input2 = 11;

        // Get the sum of primes excluding the smallest prime
        int result = findSumOfPrimes(input1, input2);

        // Output the result
        System.out.println("Sum of primes excluding the smallest: " + result);
    }
}
