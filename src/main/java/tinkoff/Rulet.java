package tinkoff;

import java.util.Scanner;

public class Rulet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(cut(n));

    }

    public static int cut(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + cut(n / 2);
        }
        return 1 + cut(n - 1);
    }
}

//    int[] nums = {0, 1, 2, 3, 5, 6, 20, 50, 100, 1000, 10000};
//        for (int n : nums) {
//            System.out.println(n + " " + cut(n));
//        }