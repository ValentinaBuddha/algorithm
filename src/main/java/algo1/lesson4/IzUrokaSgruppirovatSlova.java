package algo1.lesson4;

import java.util.*;

public class IzUrokaSgruppirovatSlova {
    public static void main(String[] args) {
        String[] words = {"eat", "ate"};

        System.out.println(groupWords(words));
    }

    public static List<List<String>> groupWords(String[] words) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!groups.containsKey(sorted)) {
                groups.put(sorted, new ArrayList<>());
            }
            groups.get(sorted).add(word);
        }
        List<List<String>> ans = new ArrayList<>();
        ans.addAll(groups.values());
        return ans;
    }
}
