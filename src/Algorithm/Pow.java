package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Pow {

    /**
     * Looping
     * @param num
     * @param numPow
     * @return
     */
    static double countPowNumberLooping(double num, double numPow) {

        double resultPow = 1;

        if (numPow < 0) return -1;

        for (int i = 0; i < numPow; i++) {
            resultPow = resultPow * num;
        }
        return resultPow;
    }

    /**
     * Divede and Concure Recursive
     * @param num
     * @param expo
     * @return
     */
    static int countPowNumberRecursive(int num, int expo) {
        if (expo == 0) {
            return 1;
        }

        int powNumber = countPowNumberRecursive(num, expo / 2);
        if(expo % 2 == 0) {
            return  powNumber * powNumber;
        } else {
            return num * powNumber * powNumber;
        }
    }


    /**
     * Power with Recursive Memoization
     * @param memo
     * @param num
     * @param expo
     * @return
     */
    static int countPowNumberRecursiveMemo(Map<Integer, Integer> memo, int num, int expo) {
        if (expo == 0) {
            return 1;
        }

        if (memo.containsKey(expo)) {
            return memo.get(expo);
        }

        int powNumber = countPowNumberRecursiveMemo(memo, num, expo / 2);

        if(expo % 2 == 0) {
            powNumber = powNumber * powNumber;
        } else {
            powNumber = num * powNumber * powNumber;
        }
        memo.put(expo, powNumber);
        return powNumber;
    }

    public static void main(String[] args) {
        System.out.println(countPowNumberLooping(2,2));
        System.out.println(countPowNumberRecursive(2, 10));

        Map<Integer, Integer> memo = new HashMap<>();

        System.out.println(countPowNumberRecursiveMemo(memo, 2,10));
    }
}
