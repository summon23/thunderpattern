package Problem;

public class KdiffFinder {

    /**
     * Input: arr[] = {1, 5, 3, 4, 2}, k = 3
     * Output: 2
     * There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2}
     *
     * Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
     * Output: 5
     * There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8},
     * {8, 12}, {12, 16} and {16, 20}
     */

    static int countPairskDiff(int array[], int num) {
        int pairs = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] - array[j] == num
                        || array[j] - array[i] == num) pairs++;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] listNumber = { 1, 5, 3, 4, 2 };

        int res = countPairskDiff(listNumber, 3);
        System.out.println(res);
    }
}
