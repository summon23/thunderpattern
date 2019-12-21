package Problem.String;


import java.util.HashMap;

public class DuplicateChar {

    /**
     * Output
     * List of duplicate characters in String 'Programming'
     * g : 2
     * r : 2
     * m : 2
     * List of duplicate characters in String 'Combination'
     * n : 2
     * o : 2
     * i : 2
     * List of duplicate characters in String 'Java'
     *
     * @param words
     */
    private static void printDuplicateChar(String words) {
        String[] chars = words.split("");
        HashMap<String, Integer> indexChar = new HashMap<>();

        for (String i:chars) {
            int value = 0;
            if (indexChar.containsKey(i)) value = indexChar.get(i);
            indexChar.put(i, value + 1);
        }

        System.out.println(indexChar);
    }

    public static void main(String[] args) {
        String words = "Programming";
        printDuplicateChar(words);
    }
}
