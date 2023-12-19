package cz.robodreams.javadeveloper.homeworks.hw06fibo;

public class Fibonacci {

    /**
     * Implement by https://cs.wikipedia.org/wiki/Fibonacciho_posloupnost
     *
     *
     */
    public long implementFibonacciByRecursion(int n) {
        if (n <= 1) {
            return n;
        } else {
            return implementFibonacciByRecursion(n - 1) + implementFibonacciByRecursion(n - 2);
        }
    }

    /**
     * Implement by5 https://cs.wikipedia.org/wiki/Fibonacciho_posloupnost
     *
     *
     */

    public long implementFibonacciByFor(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter n must be non-negative.");
        }

        if (n <= 1) {
            return n;
        }

        long fibPrev = 0;
        long fibCurrent = 1;

        for (int i = 2; i <= n; i++) {
            long temp = fibCurrent;
            fibCurrent = fibPrev + fibCurrent;
            fibPrev = temp;
        }

        return fibCurrent;
    }
}
