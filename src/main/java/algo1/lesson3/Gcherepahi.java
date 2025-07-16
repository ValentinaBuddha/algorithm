package algo1.lesson3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gcherepahi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<Integer> validPositions = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] turtle = scanner.nextLine().split(" ");
            int a = Integer.parseInt(turtle[0]);
            int b = Integer.parseInt(turtle[1]);

            if (a >= 0 && b >= 0 && a + b + 1 == n) {
                validPositions.add(a + 1);
            }
        }

        System.out.println(validPositions.size());
    }
}
