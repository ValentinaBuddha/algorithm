package algo1.lesson2;

import java.util.Scanner;

public class CnearestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        int x = sc.nextInt();

        int[] arr = new int[size];
        String[] l = line.split(" ");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(l[i]);
        }

        System.out.println(findNearestNumber(arr, x, size));
    }

    public static int findNearestNumber(int[] arr, int x, int size) {
        int y = arr[0];
        int minDif = Math.abs(y - x);

        for (int i = 1; i < size; i++) {
            int actDif = Math.abs(arr[i] - x);
            if (actDif < minDif) {
                y = arr[i];
                minDif = actDif;
            }
        }
        return y;
    }
}
