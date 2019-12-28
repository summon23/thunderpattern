package Problem.String;

import java.util.ArrayList;
import java.util.List;

public class IntelegentString {

    static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static int getSpecialSubstring(String s, int k, String charValue) {
        // Write your code here
        String[] getNormalChar = charValue.split("");
        List<Character> normalChar = new ArrayList<>();

        for (int i = 0; i < getNormalChar.length; i++) {
            if (Integer.parseInt(getNormalChar[i]) == 0) normalChar.add(alphabet[i]);
        }

        System.out.println(normalChar);
        int totalSubtring = 0;


        char charS[] = s.toCharArray();
        int lengthS = charS.length;

        int indexScan = 0;
        for (char c:s.toCharArray()) {
            int totalNormal = 0;
            int totalSpecial = 0;
            int substrScan = indexScan + 1;

            String subtring = String.valueOf(c);
            if (normalChar.contains(c)) { totalNormal++; } else { totalSpecial++; }

            if (substrScan < lengthS) {
//                if (substrScan >= lengthS) substrScan = lengthS - 1;
                while (substrScan < lengthS) {
                    if (totalNormal == k && normalChar.contains(charS[substrScan])) break;

                    if (!normalChar.contains(charS[substrScan])) {
                        totalSpecial++;
                    } else {
                        totalNormal++;
                    }
                    subtring = subtring.concat(String.valueOf(charS[substrScan]));
                    substrScan++;
                }

                System.out.println(subtring + ":" +totalNormal + "|" + totalSpecial);

                indexScan++;
            }

            if (totalNormal == k && totalSpecial != 0) totalSubtring++;
        }

        return totalSubtring;
    }

    public static void main(String[] args) {
        System.out.println(getSpecialSubstring("giraffe", 2, "01111001111111111011111111"));
    }
}
