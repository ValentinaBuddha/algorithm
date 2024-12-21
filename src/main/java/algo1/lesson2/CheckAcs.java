package algo1.lesson2;

import java.util.*;

public class CheckAcs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (isSorted(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (!(array[i] < array[i + 1]))
                return false;
        }
        return true;
    }
}

