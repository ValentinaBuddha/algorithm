package algo1.lesson1;

import java.util.Scanner;

public class Ctelnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newNumber = scanner.next();
        String oldNumber1 = scanner.next();
        String oldNumber2 = scanner.next();
        String oldNumber3 = scanner.next();


        newNumber = newNumber.replaceAll("-?[^\\d]", "");
        String numNew = changeFormat(newNumber);

        oldNumber1 = oldNumber1.replaceAll("-?[^\\d]", "");
        oldNumber2 = oldNumber2.replaceAll("-?[^\\d]", "");
        oldNumber3 = oldNumber3.replaceAll("-?[^\\d]", "");

        String num1 = changeFormat(oldNumber1);
        String num2 = changeFormat(oldNumber2);
        String num3 = changeFormat(oldNumber3);


        if (num1.equals(numNew)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        if (num2.equals(numNew)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        if (num3.equals(numNew)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static String changeFormat(String noFormatedNumber) {
        StringBuilder formatedNumer = new StringBuilder();
        if (noFormatedNumber.length() == 7) {
            formatedNumer.append("495");
            formatedNumer.append(noFormatedNumber);
        } else if (noFormatedNumber.length() == 11) {
            formatedNumer.append(noFormatedNumber);
            formatedNumer.deleteCharAt(0);
        } else {
            System.out.println("wrong number");
        }
        return formatedNumer.toString();
    }
}

