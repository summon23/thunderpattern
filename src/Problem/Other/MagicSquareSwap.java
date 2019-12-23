package Problem.Other;

public class MagicSquareSwap {

    private static int[][][] matrixCombination = {
        {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
        {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
        {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
        {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
        {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
        {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
        {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}
    };

    /**
     * https://www.hackerrank.com/challenges/magic-square-forming/problem
     */
    private static int swapSquare(int[][] s) {
        int effort = -1;

        for (int[][] matrixSample:matrixCombination) {
            int tempDiff = 0;
            for (int i = 0; i < matrixSample.length; i++) {
                for (int j = 0; j < matrixSample[i].length; j++) {
                    tempDiff += Math.abs(matrixSample[i][j] - s[i][j]);
                }
            }
            if (effort == -1) effort = tempDiff;
            if (tempDiff < effort) effort = tempDiff;
            System.out.println(tempDiff + "->" +effort);
        }

        return effort;
    }

    public static void main(String[] args) {
        int sample[][] = {{4,9,2}, {3,5,7}, {8,1,6}};

        int minSwap = swapSquare(sample);
        System.out.println(minSwap);
    }
}
