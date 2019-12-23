package Problem.Other;

import java.text.DecimalFormat;

public class PlusMinusFraction {

    /**
     * For example, given the array 1, 1, 0, -1, -1
     * there are 5 elements, two positive, two negative and one zero.
     * Their ratios would be 2/5,  2/5 and 1/5.
     */

    static DecimalFormat df = new DecimalFormat("#.######");
    private static void printRatioPlusMinus(int[] nums) {
        double totalNumbers = nums.length;

        double plusNums = 0;
        double minNums = 0;
        double zeroNums = 0;
        for (int i:nums) {
            if (i == 0) zeroNums++;
            if (i > 0) plusNums++;
            if (i < 0) minNums++;
        }


        double ratioPlus = plusNums / totalNumbers;
        System.out.println(String.format("%.6f",ratioPlus));

        double ratioMin = minNums / totalNumbers;
        System.out.println(String.format("%.6f",ratioMin));

        double ratioZero = zeroNums / totalNumbers;
        System.out.println(String.format("%.6f",ratioZero));
    }

    public static void main(String[] args) {
        int nums[] = {-4, 3, -9, 0, 4, 1};
        printRatioPlusMinus(nums);
    }
}
