package Problem;

import java.util.HashMap;

/*
 * K Diff Finder solution with hashmap
 */
public class KdiffFinderHashmap {
    static int countPairskDiff(int[] arr, int k) {
        int pairs = 0;
        int n = arr.length - 1;
        int max = 100000;
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int i = 0; i <= n ; i++) {
            hashMap.put(arr[i], true);
        }

        for (int i = 0; i <= n; i++) {
            if (arr[i] + k >= 0 && arr[i] - k <= max) {
                int x = arr[i];

                if (hashMap.containsKey(x - k)) pairs++;
                if (hashMap.containsKey(x + k)) pairs++;
                hashMap.remove(x);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] listNumber = { 1, 4, 5, 3, 4, 2 };

        int res = countPairskDiff(listNumber, 3);
        System.out.println(res);
    }
}
