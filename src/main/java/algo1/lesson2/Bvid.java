package algo1.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bvid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        while (true) {
            int num = sc.nextInt();
            if (num == -2000000000) {
                break;
            }
            list.add(num);
        }

        boolean asc = false;
        boolean equal = false;
        boolean desc = false;

        if (list.size() > 1) {
            for (int i = 0; i < list.size() - 1; i++) {
                int a = list.get(i);
                int b = list.get(i + 1);
                if (a == b) {
                    equal = true;
                } else if (a < b) {
                    asc = true;
                } else {
                    desc = true;
                }
            }
        } else {
            System.out.println("RANDOM");
        }

        if (equal && asc && desc) {
            System.out.println("RANDOM");
        }
        if (equal && !asc && !desc) {
            System.out.println("CONSTANT");
        }
        if (equal && asc && !desc) {
            System.out.println("WEAKLY ASCENDING");
        }
        if (equal && !asc && desc) {
            System.out.println("WEAKLY DESCENDING");
        }
        if (!equal && !asc && desc) {
            System.out.println("DESCENDING");
        }
        if (!equal && asc & !desc) {
            System.out.println("ASCENDING");
        }
    }
}
