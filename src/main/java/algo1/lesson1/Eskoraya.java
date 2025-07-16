package algo1.lesson1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Eskoraya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] l = line.split(" ");

        int k1 = Integer.parseInt(l[0]);//номер кв
        int m = Integer.parseInt(l[1]);//кол этажей
        int k2 = Integer.parseInt(l[2]);//номер кв2
        int p2 = Integer.parseInt(l[3]);//номер падика2
        int n2 = Integer.parseInt(l[4]);//номер этажа2

        int[] result = solve(k1, m, k2, p2, n2);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] solve(int k1, int m, int k2, int p2, int n2) {
        int[] impossible = {-1, -1};

        //этаж квартиры 2 больше кол-ва этажей
        if (n2 > m) {
            return impossible;
        }

        // Если один этаж в доме, и квартира 2 на 1м этаже,
        // и при этом номер квартиры 2 меньше номера квартиры 1,
        // то подъездов может быть сколько угодно,
        // и подъезд квартиры 1 определить невозможно, а этаж будет 1
        if (p2 == 1 && n2 == 1 && m == 1) {
            return new int[]{0, 1};
        }

        //если номер кв1 = кол-ву этажей,
        //то подъезд будет 1, а этаж = k1 = m
        if (k1 == m) {
            return new int[]{1, k1};
        }

        /*Все квартиры до подъезда p2 занимают (p2 - 1) * m * c квартир.
        В подъезде p2 до этажа n2 включительно — ещё n2 * c квартир.
        Таким образом, k2 должна попадать в диапазон между:
        (p2 - 1) * m * c + (n2 - 1) * c (последняя квартира предыдущего этажа),
        (p2 - 1) * m * c + n2 * c (последняя квартира этажа n2).*/

        // Минимальное возможное c - возможное количество квартир на одном этаже
        int cLower = (int) Math.ceil((double) k2 / ((p2 - 1) * m + n2));

        // Максимальное возможное c
        int cUpper;
        if (p2 == 1 && n2 == 1) {
            cUpper = 1000000;
        } else {
            cUpper = (int) Math.floor((double) (k2 - 1) / ((p2 - 1) * m + (n2 - 1)));
        }

        if (cLower > cUpper) {
            return impossible;
        }

        Set<Integer> possibleP = new HashSet<>();
        Set<Integer> possibleN = new HashSet<>();

        for (int c = cLower; c <= cUpper; c++) {
            if (!isValidC(c, k2, p2, n2, m)) {
                continue;
            }

            int flatsPerEntrance = c * m;//колво квартир в одном подъезде

            int p1 = (k1 - 1) / flatsPerEntrance + 1;
            int n1 = ((k1 - 1) % flatsPerEntrance) / c + 1;

            possibleP.add(p1);
            possibleN.add(n1);
        }

        int resultP = possibleP.size() == 1 ? possibleP.iterator().next() : 0;
        int resultN = possibleN.size() == 1 ? possibleN.iterator().next() : 0;

        return new int[]{resultP, resultN};
    }


    private static boolean isValidC(int c, int k2, int p2, int n2, int m) {
        int flatsPerEntrance = m * c; //колво квартир в одном подъезде
        int actualP2 = (k2 - 1) / flatsPerEntrance + 1;
        int remaining = (k2 - 1) % flatsPerEntrance;//сколько квартир осталось после заполнения всех целых подъездов
        int actualN2 = remaining / c + 1;

        return (actualP2 == p2) && (actualN2 == n2);
    }
}
