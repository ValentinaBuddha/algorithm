import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Set;
import java.util.HashSet;

public class A {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> set = new HashSet<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] l = bufferedReader.readLine().split("\\s");
                for (String word : l) {
                    set.add(word);
                }
            }
            System.out.println(set.size());
            bufferedReader.close();
        } catch (IOException e) {
            System.exit(0);
        }
    }
}