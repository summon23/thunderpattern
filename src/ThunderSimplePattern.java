import com.sun.org.apache.xpath.internal.operations.Number;

import java.util.Arrays;

public class ThunderSimplePattern {
    public static void main(String[] args) {
        int input = 5;
        int length = input * 2 - 1;
        char[][] array = new char[length][length];

        for (char[] m : array) {
            Arrays.fill(m, ' ');
        }

        int j = 0;
        for (int i = length / 2; i <= length - 1; i++,  j++) {
            array[j][i] = 'x';

            boolean isX;
            for (int k = j + 2; k <= length / 2; k += 2) {
                isX = (k - j) % 4 == 0 ? true : false;
                array[k][i] = isX ? 'x' : 'o';
            }
        }

        j = length / 2;
        for (int i = 0; i <= length / 2; i++,  j++) {
            array[j][i] = 'x';

            boolean isX;
            for (int k = j - 2; k >= length / 2; k -= 2) {
                isX = (k - j) % 4 == 0 ? true : false;
                array[k][i] = isX ? 'x' : 'o';
            }
        }

        for (char[] chs : array) {
            for (char ch : chs) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
