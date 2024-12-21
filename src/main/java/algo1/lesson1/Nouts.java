package algo1.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Nouts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] l = line.split(" ");

        int a = Integer.parseInt(l[0]);
        int b = Integer.parseInt(l[1]);
        int c = Integer.parseInt(l[2]);
        int d = Integer.parseInt(l[3]);

        int[] x1 = new int[4];
        int[] x2 = new int[4];
        int[] p = new int[4];

        if (a >= d) {
            x1[0] = a;
        } else {
            x1[0] = d;
        }
        x2[0] = b + c;
        p[0] = x1[0] * x2[0];

        if (a >= c) {
            x1[1] = a;
        } else {
            x1[1] = c;
        }
        x2[1] = b + d;
        p[1] = x1[1] * x2[1];

        if (b >= d) {
            x1[2] = b;
        } else {
            x1[2] = d;
        }
        x2[2] = a + c;
        p[2] = x1[2] * x2[2];

        if (b >= c) {
            x1[3] = b;
        } else {
            x1[3] = c;
        }
        x2[3] = a + d;
        p[3] = x1[3] * x2[3];

        Arrays.sort(p);

        List<Integer> ind = new ArrayList<>();
        int min = p[0];
        for (int i = 0; i < 4; i++) {
            if (x1[i] * x2[i] == min) {
                ind.add(i);
            }
        }

//        for (int i : ind) {
//            System.out.println(x1[i] + " " + x2[i]);
//            System.out.println(x2[i] + " " + x1[i]);
//        }

        System.out.println(x1[ind.get(0)] + " " + x2[ind.get(0)]);
    }
}
