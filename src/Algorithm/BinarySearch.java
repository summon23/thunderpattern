package Algorithm;

public class BinarySearch {

    static boolean runSearch(int[] arr, int l, int r, int k) {
        if (r >= l) {
            int mid = l + (r- l) / 2;
            if (arr[mid] == k) return true;
            if (arr[mid] > k) {
                // Go to Left
                return runSearch(arr, l, mid - 1, k);
            }

            // Else go to Right
            return runSearch(arr, mid + 1, r, k);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] listNum = { 1, 2, 5 , 11, 12, 44, 51, 112, 3334};

        int n = listNum.length - 1;
        int numToSearch = 3334;
        boolean isNumberExist = runSearch(listNum, 0, n, numToSearch);
        System.out.println(isNumberExist);
    }
}
