package algo1.lesson3;

import java.util.*;

public class OpenCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            list.add(a);
        }

        int[] arr2 = Arrays.stream(s.nextLine().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(checkButton(list, arr2));
    }

    public static int checkButton(List<Integer> list, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
                if (!list.contains(arr2[i])) {
                    set.add(arr2[i]);
                }
        }
        return set.size();
    }
}
