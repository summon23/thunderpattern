import java.util.Arrays;

public class ThunderBoltPattern {
    public static void main(String[] args) {
        int input = 10;
        int evenOddFactor = (input % 2 == 0) ? 0 : 1; // If it is even, add 1 else it should be 0
        // length on pattern based on input
        int length = input * 2 - evenOddFactor;

        // Using character array to store individual character at various point
        char[][] array = new char[length][length];
        for (char[] m : array) {
            Arrays.fill(m, ' ');
        }
        int factor = 0;

        while (factor < input) {
            for (int i = 0 + factor, j = input - 1; i < input; i++, j++) {
                array[i][j] = 'x';
                array[j][i] = 'x';
            }
            for (int i = 2 + factor, j = input - 1; i < input; i++, j++) {
                array[i][j] = 'o';
                array[j][i] = 'o';
            }
            // Because character are repeated on same line after 4 digit, using 4 as factor
            factor += 4;
        }

        for (char[] chs : array) {
            for (char ch : chs) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}