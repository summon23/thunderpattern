package Problem.String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class LexicoOrder {
    final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    static Long getWeight(String word) {
        String numString = "";
        int x = word.toCharArray().length;
        for (int j = 0; j < x; j++) {
            char c = word.charAt(j);
            int index = alphabet.indexOf(c) + 1;

            if (Integer.toString(index).length() == 1) {
                numString += "0" + Integer.toString(index);
            } else {
                numString += Integer.toString(index);
            }

        }

        return Long.valueOf(numString);
    }

    static String findLowestOrder (String originalWord, ArrayList<String> permutation) {

        Long originalWeight = getWeight(originalWord);

        String lowestString = "";
        Long lowestWeight = new Long("-1");

        int size = permutation.size();
        for (int i = 0; i < size; i++) {
            String word = permutation.get(i).trim();

            Long weight = getWeight(word);


            if (
                    !word.trim().equals(originalWord.trim()) &&
                    (
                            ((weight < lowestWeight) || (lowestWeight == -1)) &&
                                    (weight > originalWeight))) {
                lowestWeight = weight;
                lowestString = word;
            }
        }


        if (lowestString.equals("")) {
            System.out.println("no answer");
            lowestString = "no answer";
        } else {
            System.out.println(lowestString);
        }
        return lowestString;
    }

    static void getStringPermutation(ArrayList<String> permutationString, String str, String ans)
    {
        // If string is empty
        if (str.length() == 0) {
//            System.out.print(ans + " ");
            permutationString.add(ans + " ");
        }

        int length = str.length();
        for (int i = 0; i < length; i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            getStringPermutation(permutationString, ros, ans + ch);
        }

    }

    /**
     * https://en.wikipedia.org/wiki/Lexicographical_order
     * https://www.hackerrank.com/challenges/bigger-is-greater/problem
     */
    static void runOrder (String[] words) {
        for (String word:words) {

            ArrayList<String> permut = new ArrayList<>();
            getStringPermutation(permut, word.trim(), "");

            System.out.println(permut);
            findLowestOrder(word.trim(), permut);
        }
    }

    static void runSwap (String[] words) {

    }


    public static void main(String[] args) {
        String[] sampleWords = {"ab", "bb", "hefg", "dhck", "dkhc"};
//        String[] sampleWords = {"lmno",
//                "dcba",
//                "dcbb",
//                "abdc",
//                "abcd",
//                "fedcbabcd"};


//        getWeight("aaaa");
//        getWeight("dkhc");
//        getWeight("hcdk");
        runOrder(sampleWords);
        runSwap(sampleWords);
    }
}
