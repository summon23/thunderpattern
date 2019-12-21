package Problem.String;

import java.util.Arrays;

public class CheckAnnagram {
    private static void isAnnagram(String wordOne, String wordTwo) {
        System.out.println("Word 1:" + wordOne);
        System.out.println("Word 2:" + wordTwo);

        char[] listCharOne = wordOne.toCharArray();
        char[] listCharTwo = wordTwo.toCharArray();

        Arrays.sort(listCharOne);
        Arrays.sort(listCharTwo);

        if (Arrays.equals(listCharOne, listCharTwo)) {
            System.out.println("ANAGRAM");
        } else {
            System.out.println("NOT ANAGRAM");
        }
    }

    public static void main(String[] args) {
        isAnnagram("listens", "xsilent");
    }
}
