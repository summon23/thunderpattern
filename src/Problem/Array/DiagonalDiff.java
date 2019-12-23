package Problem.Array;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiff {
    private static List<Integer> convertArrayToList(int array[]) {
        List<Integer> list = new ArrayList<>();
        for (int t : array) {
            list.add(t);
        }
        return list;
    }

    private static int[][] toDoubleIndexArray(List<List<Integer>> mergedList) {
        int[][] result = new int[mergedList.size()][];
        for (int i = 0; i< mergedList.size(); i++) {
            List<Integer> currentList =  mergedList.get(i);
            System.out.println(currentList);
            result[i] = currentList.stream().mapToInt(item -> item).toArray();
        }
        return result;
    }

    private static int getDiagonalDiff(List<List<Integer>> arr) {
        int leftD = 0;
        int rightD = 0;
        int nums[][] = toDoubleIndexArray(arr);

        for (int i = 0; i < nums.length; i++) {
            leftD += nums[i][i];
            rightD += nums[nums.length -1 -i][i];
        }
        return Math.abs(leftD - rightD);
    }

    public static void main(String[] args) {
        int array[][] = {{11,2,4},{4,5,6},{10,8,-12}};
        List<List<Integer>> diagonalNumber = new ArrayList<>();


        for (int[] i:array) {
            diagonalNumber.add(convertArrayToList(i));
        }

        int diff = getDiagonalDiff(diagonalNumber);
        System.out.println("Difference:" + diff);

    }
}
