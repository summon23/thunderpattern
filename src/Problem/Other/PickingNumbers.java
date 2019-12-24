package Problem.Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

    /**
     * https://www.hackerrank.com/challenges/picking-numbers/problem
     * @return
     */
    private static int findLongestLengthSolution(List<Integer> a) {

        int maxLengthArray = 0;
        int lengthArray = 0;

        Collections.sort(a);
        for (int i = 0; i < a.size() - 1; i++) {
            System.out.println(a.get(i) +"->"+ a.get(i + 1));

            if ((Math.abs(a.get(i) - a.get(i + 1))) <= 1 && lengthArray != 5) {
                System.out.println("start");
                lengthArray++;
            } else {
                lengthArray = 0;
            }

            if (i == a.size() - 2 && lengthArray != 5) lengthArray++;
            if (lengthArray > maxLengthArray) maxLengthArray = lengthArray;
        }
        return maxLengthArray;
    }

    static int pickingNumbers(List<Integer> a) {
        int[] arr = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }

        int[] count=new int[arr.length-1];
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            ArrayList<Integer> arrs = new ArrayList<Integer>();
            arrs.add(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])==0||Math.abs(arr[i]-arr[j])==1){
                    arrs.add(arr[j]);
                }

            }
            count[i]=arrs.size();
        }
        Arrays.sort(count);
        return count[count.length-1];
    }

    public static void main(String[] args) {
//        int sample[] = {1,1,2,2,4,4,5,5,5};
        int sample[] = {4,6,5,3,3,1};
//        int sample[] = {1,2,2,3,1,2};

        // Do Sorting
        // Arrays.sort(sample);


        List<Integer> listSample = new ArrayList<>();
        for (int i:sample) {
            listSample.add(i);
        }

        System.out.println("RES: " + pickingNumbers(listSample));
        int solution = findLongestLengthSolution(listSample);
        System.out.println(solution);
    }
}
