package algo1.lesson1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IzUroka {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        Map<Character, Integer> occurrences = new HashMap<>();

        for (char c : line.toCharArray()) {
            if (!occurrences.containsKey(c))
                occurrences.put(c, 1);
            else
                occurrences.put(c, occurrences.get(c) + 1);
        }

        int maxValueInMap = (Collections.max(occurrences.values()));
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("Наиболее часто встречающаяся буква: " + entry.getKey());
                break;
            }
        }
    }
}
