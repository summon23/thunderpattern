package Problem.Array;

import java.util.ArrayList;

public class MissingNumber {

    private static ArrayList<Integer> findMissingNumbers(int[] listOfNumber) {
        ArrayList<Integer> missingNumbers = new ArrayList<>();

        for (int i = 0; i < listOfNumber.length - 1; i++) {
            if (listOfNumber[i+1] != listOfNumber[i] + 1) missingNumbers.add(listOfNumber[i] + 1);
        }
        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] listOfNumber = {1,2,3,5,6,7,9};

        System.out.println(findMissingNumbers(listOfNumber));
    }
}
