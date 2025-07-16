package algo1.lesson1;

import java.util.Scanner;

public class Iuznik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        check(a, b, c, d, e);
    }

    private static void check(int a, int b, int c, int d, int e) {
        int min1 = Math.min(Math.min(a, b), c);
        int min2;
        if (min1 == a) {
            min2 = Math.min(b, c);
        } else if (min1 == b) {
            min2 = Math.min(a, c);
        } else {
            min2 = Math.min(a, b);
        }

        // Находим две наименьшие стороны отверстия
        int holeMin = Math.min(d, e);
        int holeMax = Math.max(d, e);

        // Проверяем, помещаются ли минимальные стороны кирпича в отверстие
        if (Math.min(min1, min2) <= holeMin && Math.max(min1, min2) <= holeMax) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}