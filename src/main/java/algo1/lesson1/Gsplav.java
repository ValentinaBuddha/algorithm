package algo1.lesson1;

import java.util.Scanner;

public class Gsplav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] l = line.split(" ");

        int n = Integer.parseInt(l[0]);
        int k = Integer.parseInt(l[1]);
        int m = Integer.parseInt(l[2]);

        int xd = 0;
        if (k >= m) {
            while (n >= k) {
                int z = n / k; //количество заготовок
                int ost = n % k;
                n = ost;
                int d = (k / m) * z; //количество деталей
                xd += d;
                ost = (k % m) * z;
                n += ost;
            }
        }
        System.out.println(xd);
    }
}