package algo1.lesson3;

import java.util.*;

public class Fgenom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[] arr1 = s.nextLine().toCharArray();
        char[] arr2 = s.nextLine().toCharArray();

        if (arr1.length == 1 || arr2.length == 1) {
            System.out.println(0);
            System.exit(0);
        }

        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr1.length - 1; i++) {
            String key = Character.toString(arr1[i]) + Character.toString(arr1[i + 1]);
            if (map1.containsKey(key)) {
                map1.put(key, map1.get(key) + 1);
            } else {
                map1.put(key, 1);
            }
        }

        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr2.length - 1; i++) {
            String key = Character.toString(arr2[i]) + Character.toString(arr2[i + 1]);
            if (map2.containsKey(key)) {
                map2.put(key, map2.get(key) + 1);
            } else {
                map2.put(key, 1);
            }
        }

        int count = 0;
        for (String pair : map1.keySet()) {
            if (map2.containsKey(pair)) {
                count = count + map1.get(pair);
            }
        }
        System.out.println(count);
    }
}