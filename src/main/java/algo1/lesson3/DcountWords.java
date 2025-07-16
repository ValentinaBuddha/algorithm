package algo1.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DcountWords {
    public static void main(String[] args) throws IOException {
        Set<String> wordsSet = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordsSet.add(word);
                    }
                }
            }
        }

        System.out.println(wordsSet.size());
    }
}