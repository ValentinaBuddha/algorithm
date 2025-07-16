package algo1.lesson3;

public class ZcompareTwoNumbers {
    public static void main(String[] args) {
        System.out.println(isDigitPermutation(2021, 1022));
    }

    public static boolean isDigitPermutation(int x, int y) {
        int[] digitsX = countDigits(x);
        int[] digitsY = countDigits(y);
        for (int i = 0; i < 10; i++) {
            if (digitsX[i] != digitsY[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] countDigits(int num) {
        int[] arr = new int[10];
        while (num > 0) {
            int lastDigit = num % 10;
            arr[lastDigit]++;
            num /= 10;
        }
        return arr;
    }
}
