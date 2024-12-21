package tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class DelivConract {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int t = arr[1];
        int[] floors = Arrays.stream(s.nextLine().split("  ")).mapToInt(Integer::parseInt).toArray();
        int sotr = Integer.parseInt(s.nextLine());

        System.out.println(countFloors(n, t, floors, sotr));
    }

    public static int countFloors(int n, int t, int[] floors, int sotr) {
        int tSotr = floors[sotr - 1];//4
        int tDel;
        if (t >= tSotr) {
            tDel = floors[n - 1] - floors[0];
        } else {
            tDel = floors[sotr - 1] - 2 * floors[0] + floors[n - 1];
        }
        return tDel;
    }
}
