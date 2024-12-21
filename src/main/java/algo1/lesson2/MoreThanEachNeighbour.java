package algo1.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class MoreThanEachNeighbour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(checkMoreThanEachNeighbour(array));
    }

    public static int checkMoreThanEachNeighbour(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            int n1 = array[i - 1];
            int act = array[i];
            int n2 = array[i + 1];
            if (act > n1 && act > n2) {
                count += 1;
            }
        }
        return count;
    }
}
