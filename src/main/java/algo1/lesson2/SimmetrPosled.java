package algo1.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class SimmetrPosled {
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

        int m = 0;
        if (sim) {
            System.out.println(m);
        } else {
            if (arr[n - 2] == arr[n - 1]) {
                m = n - 2;
                createNewArr(arr, m);
            } else {
                m = n - 1;
                createNewArr(arr, m);
            }
        }
    }

    public static void createNewArr(int[] arr, int m) {
        int[] result = new int[m];
        int index = 0;
        for (int i = m - 1; i >= 0; i--) {
            result[index] = arr[i];
            index++;
        }
        System.out.println(m);

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < m - 1; i++) {
            res.append(result[i]);
            res.append(" ");
        }
        res.append(result[m - 1]);
        System.out.println(res);
    }
}

//22
//1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8