package Algorithm;

import java.util.Arrays;

public class MergeSort {
    static  void merge(int array[], int l, int m, int r) {
        System.out.println(l + " -> " + m + " -> " + " -> " + r);

        // Clone Subset Array using Array Copy
        int[] L = Arrays.copyOfRange(array, l, m + 1);
        int[] R = Arrays.copyOfRange(array, m + 1, r + 1);

        System.out.println(Arrays.toString(L));
        System.out.println(Arrays.toString(R));
        System.out.println("------");


        // Clone Subset Array using Manual Looping
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        int L[] = new int [n1];
//        int R[] = new int [n2];
//
//        for (int i=0; i<n1; ++i)
//            L[i] = array[l + i];
//        for (int j=0; j<n2; ++j)
//            R[j] = array[m + 1+ j];


        int leftIndexSorted = 0;
        int rightIndexSorted = 0;

        int subsetArrayIndex = l;

        // Compare Left To Right Subset Array
        while (leftIndexSorted < L.length && rightIndexSorted < R.length) {
            if (L[leftIndexSorted] <= R[rightIndexSorted]) {
                array[subsetArrayIndex] = L[leftIndexSorted];
                leftIndexSorted++;
            } else {
                array[subsetArrayIndex] = R[rightIndexSorted];
                rightIndexSorted++;
            }
            subsetArrayIndex++;
        }

        // Move LeftArray Items That Not Compared
        while (leftIndexSorted < L.length) {
            array[subsetArrayIndex] = L[leftIndexSorted];
            leftIndexSorted++;
            subsetArrayIndex++;
        }


        // Move RightArray Items That Not Compared
        while (rightIndexSorted < R.length) {
            array[subsetArrayIndex] = R[rightIndexSorted];
            rightIndexSorted++;
            subsetArrayIndex++;
        }

    }

    static void runSort(int array[], int l ,int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            runSort(array, l, mid);
            runSort(array, mid + 1, r);
            merge(array, l , mid ,r);
        }
    }

    public static void main(String[] args) {
        int[] num = {12, 11, 132, 5, 63, 7, 33, 2, 1, 23, 111};

        System.out.println(Arrays.toString(Arrays.copyOfRange(num, 0, 3)));

        System.out.println("Before:");
        System.out.println(Arrays.toString(num));

        runSort(num, 0, num.length - 1);

        System.out.println("After:");
        System.out.println(Arrays.toString(num));

    }
}
