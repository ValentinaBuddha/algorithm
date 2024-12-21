package algo1.lesson1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < 1 && b < 1 && c < 1) {
            System.out.println("Введите натуральное число");
            return;
        }

        if (((a+b) > c) && ((a+c) > b) && ((b+c) > a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
