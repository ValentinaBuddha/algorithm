package algo1.lesson1;

import java.util.Scanner;

public class UravScornem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double res = 0;
        if (c < 0) {
            System.out.println("NO SOLUTION");
        } else if (c * c - b == 0 && a == 0) {
            System.out.println("MANY SOLUTIONS");
        } else {
            res = (c * c - b) / a;
            if (res % 1 == 0) {
                    System.out.println((int)res);
            } else {
                System.out.println("NO SOLUTION");
            }
        }
    }
}