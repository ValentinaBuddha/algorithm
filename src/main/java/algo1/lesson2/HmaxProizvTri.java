package algo1.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class HmaxProizvTri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long[] arr = Arrays.stream(s.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();

        findNumbers(arr);
    }

    public static void findNumbers(long[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        long a = arr[0];
        long b = arr[1];
        long c = arr[n - 1];
        long d = arr[n - 2];
        long e = arr[n - 3];


        if (a * b * c > c * d * e) {
            System.out.println(a + " " + b + " " + c);
        } else {
            System.out.println(c + " " + d + " " + e);
        }
    }
}
