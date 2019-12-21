package Problem.Array;

import java.util.Arrays;

public class FindMaxMinNumber {

    /**
     * instead of using sorting, you can find maxheap or minheap
     * @param listOfNumbers
     * @return maxNumber
     */
    private static int findMaxNumber(int[] listOfNumbers) {
        Arrays.sort(listOfNumbers);
        int maxNumber = listOfNumbers[listOfNumbers.length - 1];
        return maxNumber;
    }

    public static void main(String[] args) {
        int[] listOfNumber = {1, 3, 6, 3, 11 ,100, 2};

        System.out.println(findMaxNumber(listOfNumber));
    }
}
