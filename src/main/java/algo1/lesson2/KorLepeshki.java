package algo1.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KorLepeshki {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();
        int[] arr = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(findPosition(arr, n));
    }

    public static int findPosition(int[] arr, int n) {
        //находим позицию победителя
        int indexMax = 0;
        int max = arr[indexMax];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }

        //находим максимальное значение Василия
        int vasMax = 0;
        int indexVas = -1;
        List<Integer> v = new ArrayList<>();
        for (int i = indexMax + 1; i < n - 1; i++) {
            if ((arr[i] % 10 == 5 || arr[i] == 5) && arr[i + 1] < arr[i] && arr[i] > vasMax) {
                vasMax = arr[i];
                indexVas = i;
            }
        }

        //находим место Василия
        int pos = 0;
        if (indexVas != -1) {
            pos = 1;
            for (int i = 0; i < n; i++) {
                if (arr[i] > vasMax) {
                    pos += 1;
                }
            }
        }
        return pos;
    }
}

//12
//100
//275 5 595 35 25 5 655 305 275 115 55 445 155 145 15 5 175 65 15 335 65 5 15 5 145 25 245 85 35 15 45 85 75 565 35 235 185 175 95 165 75 455 225 205 15 5 125 95 75 65 25 15 5 35 25 15 5 235 145 5 175 95 465 145 105 25 145 35 525 385 235 175 85 15 5 185 5 385 145 125 105 55 125 15 5 625 475 285 245 155 125 974 135 95 15 5 15 75 5 65
//40