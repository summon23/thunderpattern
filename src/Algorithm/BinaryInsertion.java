package Algorithm;

public class BinaryInsertion {
    /**
     * Ascending Array
     * @param nums
     * @param l
     * @param r
     * @param numToInsert
     * @return
     */
    public static int runInsertion(int[] nums, int l, int r, int numToInsert) {
        int mid = l + (r-l) / 2;

        if (mid == 0) return mid;
        if (mid+1 >= nums.length) return nums.length;

        if (nums[mid] == numToInsert) {
            return mid;
        } else if (numToInsert > nums[mid]) { // Go Right
            if (numToInsert < nums[mid+1]) return mid + 1;
            return runInsertion(nums, mid, r, numToInsert);
        } else if (numToInsert < nums[mid]) { // Go Left
            if (numToInsert > nums[mid-1]) return mid;
            return runInsertion(nums, l, mid, numToInsert);
        } else {
            // Return Before
            return -1;
        }
    }

    /**
     * Reverse Array
     * @param nums
     * @param l
     * @param r
     * @param numToInsert
     * @return
     */
    public static int runReverseInsertion(int[] nums, int l, int r, int numToInsert) {
        int mid = l + (r-l) / 2;

        if (mid == 0) return mid;
//        if (mid+1 >= nums.length) return nums.length;

        if (nums[mid] == numToInsert) {
            return mid;
        } else if(mid+1 >= nums.length) {
            return nums.length;
        } else if (numToInsert < nums[mid]) { // Go Right
            if (numToInsert > nums[mid+1]) return mid + 1;
            return runReverseInsertion(nums, mid, r, numToInsert);
        } else if (numToInsert > nums[mid]) { // Go Left
            if (numToInsert < nums[mid-1]) return mid;
            return runReverseInsertion(nums, l, mid, numToInsert);
        } else {
            // Return Before
            return -1;
        }
    }

    public static void main(String[] args) {
//        int[] nums = {1, 2, 11, 21, 44, 111,123, 444, 555};

        int[] nums = {60,75,80,90,100};
        int indexInsertion = runInsertion(nums, 0, nums.length, 102);
        System.out.println(indexInsertion);

        int[] numsReverse = {100,90,80,75,60};
        int indexInsertionReverse = runReverseInsertion(numsReverse, 0, numsReverse.length, 102);
        System.out.println(indexInsertionReverse);
    }
}
