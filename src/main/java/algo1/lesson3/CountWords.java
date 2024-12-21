package algo1.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountWords {
    public static void main(String[] args) throws IOException {
        Set<String> wordsSet = new HashSet<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("src/main/resources/input.txt"))) {
            while (br.ready()) {
                String[] words = br.readLine().split("\\s");
                wordsSet.addAll(Arrays.asList(words));
            }
        } catch (IOException e) {
            System.exit(0);
        }

        System.out.println(wordsSet.size());
    }
}
