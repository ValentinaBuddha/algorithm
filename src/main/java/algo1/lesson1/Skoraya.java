package algo1.lesson1;

import java.util.Scanner;

public class Skoraya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] l = line.split(" ");

        int k1 = Integer.parseInt(l[0]);
        int m = Integer.parseInt(l[1]);
        int k2 = Integer.parseInt(l[2]);
        int p2 = Integer.parseInt(l[3]);
        int n2 = Integer.parseInt(l[4]);

        int x = k2/n2; //колво квартир на этаже
        int p1= k1/m + 1;
        int y =k1%m;
        int n1 = y/x;

        System.out.println(p1 + " " + n1);
    }
}
