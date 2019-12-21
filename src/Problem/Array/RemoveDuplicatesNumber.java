package Problem.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesNumber {

    private static int[] removeDuplicateNumberInArray(int[] listOfNumber) {
        ArrayList<Integer> numberExists = new ArrayList<>();

        for (int i=0;i <= listOfNumber.length - 1;i++) {
            if (numberExists.contains(listOfNumber[i])) {
                listOfNumber[i] = 0;
            } else {
                numberExists.add(listOfNumber[i]);
            }
        }
        return listOfNumber;
    }

    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},
        };

        for (int[] input: test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicateNumberInArray(input)));
            System.out.println("");
        }

    }
}

