package algo1.lesson4;

import java.util.HashMap;
import java.util.Map;

public class IzUrokaLadyi {
    public static void main(String[] args) {
        int[] rookCoords = {21, 22, 32, 33};
        System.out.println(countBeatingRooks(rookCoords));
    }

    public static int countBeatingRooks(int[] rookCoords) {
        Map<Integer, Integer> rooksInCol = new HashMap<>();
        Map<Integer, Integer> rooksInRow = new HashMap<>();
        for (int i : rookCoords) {
            addRook(rooksInCol, i / 10);
            addRook(rooksInRow, i % 10);
        }
        return countPairs(rooksInCol) + countPairs(rooksInRow);
    }

    public static void addRook(Map<Integer, Integer> roworcol, int key) {
        if (!roworcol.containsKey(key)) {
            roworcol.put(key, 0);
        }
        int value = roworcol.get(key) + 1;
        roworcol.put(key, value);
    }

    public static int countPairs(Map<Integer, Integer> roworcol) {
        int pairs = 0;
        for (Integer key : roworcol.keySet()) {
            pairs += roworcol.get(key) - 1;
        }
        return pairs;
    }
}



