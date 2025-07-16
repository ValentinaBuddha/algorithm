package algo1.lesson1;

import java.util.*;

public class Acond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputtemp = scanner.nextLine();
        String mode = scanner.nextLine();
        String[] temp = inputtemp.split(" ");

        int troom = Integer.valueOf(temp[0]);
        int tcond = Integer.valueOf(temp[1]);

        if (troom <= -50 && troom >= 50 && tcond <= -50 && tcond >= 50) {
            System.out.println("Кондиционер не работает с температурой ниже -50 или выше 50");
            return;
        }

        switch (mode) {
            case "freeze":
                if (troom < tcond) {
                    System.out.println(troom);
                } else {
                    System.out.println(tcond);
                }
                break;
            case "heat":
                if (troom > tcond) {
                    System.out.println(troom);
                } else {
                    System.out.println(tcond);
                }
                break;
            case "auto":
                System.out.println(tcond);
                break;
            case "fan":
                System.out.println(troom);
                break;
            default:
                System.out.println("Извините, такой команды пока нет.");
        }
    }
}