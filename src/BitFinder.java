import java.util.ArrayList;
import java.util.Arrays;

public class BitFinder {
    static int convertIntToBitArray(int num) {
        int res = num;
        int countBit = 0;
        ArrayList<Integer> tempBin = new ArrayList<Integer>();
        while (res >= 1) {
            if (res == 1) {
                tempBin.add(1);
                countBit++;
                break;
            }
            int bit = res % 2 == 0 ? 0 : 1;
            if (bit == 1) countBit++;
            res =  Math.abs(res / 2);
            tempBin.add(bit);
        }

        return countBit;
    }

    public static int countBits(int n){
        // Show me the code!
        return convertIntToBitArray(n);
    }

    public static void main(String[] args) {
        int res = countBits(77231418);
        System.out.println(res);
    }

}