package Problem;

import java.util.Arrays;

/*
 * Solve Kdiff with sorting and find multinumber by k
 */
public class KdiffFinderSorting {
    private static boolean binarySearch(int l, int r, int[] arr, int x) {
        if (r >= l) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) return true;
            if (arr[mid] > x) return binarySearch(l, mid - 1, arr, x);
            return binarySearch(mid + 1, r, arr, x);
        }

        return false;
    }

    private static int countPairskDiff(int[] arr, int k) {
        int pairs = 0;

        Arrays.sort(arr);

        int n = arr.length - 1;
        for (int i = 0; i <= n ; i++)
            // Find the num as the multiple of the num
            if (binarySearch(i + 1, n , arr, arr[i] + k)) pairs++;

        return pairs;
    }

    public static void main(String[] args) {
        int[] listNumber = { 1, 5, 3, 4, 2, 13};

        int res = countPairskDiff(listNumber, 11);
        System.out.println(res);
    }
}
