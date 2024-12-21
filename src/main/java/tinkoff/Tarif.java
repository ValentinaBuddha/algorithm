package tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class Tarif {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] mob = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = mob[0];
        int b = mob[1];
        int c = mob[2];
        int d = mob[3];
        int e = d - b;

        if (e > 0) {
            System.out.println(a + e * c);
        } else {
            System.out.println(a);
        }
    }
}
