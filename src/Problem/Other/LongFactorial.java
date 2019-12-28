package Problem.Other;

import java.math.BigInteger;

public class LongFactorial {
    /**
     * https://www.hackerrank.com/challenges/extra-long-factorials/problem
     * @param n
     */
    static void extraLongFactorials(int n) {
        // Initialize result
        BigInteger f = new BigInteger("1");

        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        System.out.println(f);
    }

    static BigInteger extraLongFactorialsRecursive(int n) {
        if (n == 0) return new BigInteger("1");

        BigInteger f = new BigInteger(Integer.toString(n));
        return f.multiply(extraLongFactorialsRecursive(n-1));
    }

    static int factorialNum(int n) {
        if (n == 0) return 1;

        return n * factorialNum(n-1);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
        System.out.println(extraLongFactorialsRecursive(25));
        System.out.println(factorialNum(25));
    }
}
