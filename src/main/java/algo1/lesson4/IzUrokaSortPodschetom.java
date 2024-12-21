package algo1.lesson4;

import java.util.Arrays;

public class IzUrokaSortPodschetom {
    public static void main(String[] args) {
       int[] arr = {5, 4, 3, 2, 1, 5};
        count(arr);
    }

    public static void count(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        int k = max - min + 1;

        int[] count = new int[k + 1];
        Arrays.fill(count, 0);

        for (int num : arr) {
            count[num]++;
        }
        int pos = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[pos] = i;
                pos++;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
