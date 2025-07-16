package algo1.lesson3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AcountNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Set<Integer> set = new HashSet<>();

        for (int a : arr) {
            set.add(a);
        }

        System.out.println(set.size());
    }
}
