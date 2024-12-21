package algo1.lesson4;
//BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("src/main/resources/input.txt"));

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Sinonim {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = bufferedReader.readLine();
            int n = Integer.parseInt(s);

            Map<String, String> sin = new HashMap<>();
            for (int i = 0; i <= n; i++) {
                String line = bufferedReader.readLine();
                if (i < n) {
                    String[] arr = line.split(" ");
                    sin.put(arr[0], arr[1]);
                    sin.put(arr[1], arr[0]);
                } else {
                    System.out.println(sin.get(line));
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.exit(0);
        }
    }
}
