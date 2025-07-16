package algo1.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Ysimmetria {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int[] arr = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        checkSim(arr, n);
    }

    public static void checkSim(int[] arr, int n) {
        boolean sim = false;
        int i2 = n - 1;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] == arr[i2]) {
                sim = true;
                i2--;
            } else {
                sim = false;
                break;
            }
        }
        if (n == 1) {
            sim = true;
        }

        if (sim) {
            System.out.println(0);
        } else {
          //  createNewArr(arr, n);
        }
    }

//    public static void createNewArr(int[] arr, int n) {
//        int m = 0;
//        for (int i = 0; i < n; i++) {
//            arr[i] == arr[n - 1]
//        }
//    }
}

