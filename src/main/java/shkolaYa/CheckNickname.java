package shkolaYa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckNickname {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            char[] arr = bufferedReader.readLine().toCharArray();
            checkNickname(arr);
            bufferedReader.close();
        } catch (IOException e) {
            System.exit(0);
        }
    }

    public static void checkNickname(char[] arr) {
        if (arr.length == 0) {
            System.out.println("NO");
        } else {
            boolean minLength = arr.length > 7;
            boolean figure = false;
            boolean upperLetter = false;
            boolean lowerLetter = false;
            for (char a : arr) {
                if (a >= '0' && a <= '9') {
                    figure = true;
                    break;
                }
            }
            for (char a : arr) {
                if (a >= 'A' && a <= 'Z') {
                    upperLetter = true;
                    break;
                }
            }
            for (char a : arr) {
                if (a >= 'a' && a <= 'z') {
                    lowerLetter = true;
                    break;
                }
            }
            if (minLength && figure && upperLetter && lowerLetter) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
