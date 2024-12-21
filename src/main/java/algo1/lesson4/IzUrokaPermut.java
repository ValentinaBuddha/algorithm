package algo1.lesson4;

import java.util.Arrays;

public class IzUrokaPermut {
    public static void main(String[] args) {
        isDigPer(2021, 1022);
    }

    public static boolean isDigPer(int x, int y) {
        int[] digX = countDig(x);
        int[] digY = countDig(y);
        for (int i = 0; i < 10; i++) {
            if (digX[i] != digY[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] countDig(int num) {
        int[] digCount = new int[10];
        Arrays.fill(digCount, 0);
        while (num > 0) {
            int lastDigit = num % 10;
            digCount[lastDigit] += 1;
            num /= 10;
        }
        return digCount;
    }
}
