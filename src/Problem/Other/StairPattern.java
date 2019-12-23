package Problem.Other;

import java.util.Arrays;

public class StairPattern {

    static void printPattern(char[][] array) {
        for (char[] chs:array) {
            for (char ch : chs) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void fillStair(char[] c, int from, int to) {
        for (int i = from; i <= to; i++) {
            c[i] = '#';
        }
    }

    static void printStair(int rows) {
        char[][] pattern = new char[rows - 1][rows - 1];
        for (int i = 0; i < pattern.length; i++) {
            Arrays.fill(pattern[i], ' ');
            pattern[i][pattern[i].length - 1 - i] = '#';
            fillStair(pattern[i], pattern[i].length - 1 -i, pattern[i].length - 1);
        }

        printPattern(pattern);
    }

    public static void main(String[] args) {
        printStair(6);
    }
}
