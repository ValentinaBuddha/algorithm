package algo1.lesson1;

import java.util.Scanner;

public class Hmetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        findTime(a, b, n, m);
    }

    private static void findTime(int a, int b, int n, int m) {
        if (a == b && n != m) {
            System.out.println(-1);
            return;
        }

        int minA = n + a * (n - 1);
        int maxA = minA + 2 * a;
        int minB = m + b * (m - 1);
        int maxB = minB + 2 * b;

        int minTime = Math.max(minA, minB);
        int maxTime = Math.min(maxA, maxB);

        if (minTime > maxTime) {
            System.out.println(-1);
        } else {
            System.out.println(minTime + " " + maxTime);
        }
    }
}
