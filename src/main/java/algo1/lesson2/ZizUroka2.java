package algo1.lesson2;

import java.util.*;

public class ZizUroka2 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String line = s.nextLine();
//        int x = s.nextInt();
//        char[] nums = line.toCharArray();
//        int[] numbers = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            numbers[i] = Integer.parseInt(String.valueOf(nums[i]));
//        }
//        System.out.println(findLeft(x, numbers));
//        System.out.println(findRight(x, numbers));

//        int[] numbers = {3, 1, 4, 3, 5, 1, 1, 3, 1};
//        System.out.println(findWater(numbers));

        String line = "aabbcca";
        System.out.println(rle(line.toCharArray()));
    }

    //анайти самое левое вхождение 2 в 12123
    public static int findLeft(int x, int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x && index == -1) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int findRight(int x, int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                index = i;
            }
        }
        return index;
    }

    //макс число в последовательности если последовательность не пустая 121231
    //лучше ипользовать индекс в ответе если это строки
    public static int findMax(int[] numbers) {
        int ans = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > ans) {
                ans = numbers[i];
            }
        }
        return ans;
    }

    //два максимума если вычеркнуть из посл-ти первый максимум
    public static List<Integer> findTwoMax(int[] numbers) {
        int ans1 = Collections.max(List.of(numbers[0], numbers[1]));
        int ans2 = Collections.min(List.of(numbers[0], numbers[1]));
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > ans1) {
                ans2 = ans1;
                ans1 = numbers[i];
            } else if (numbers[i] > ans2) {
                ans2 = numbers[i];
            }
        }
        return List.of(ans1, ans2);
    }

    //найти мини четное число в послед-ти или вывести -1
    public static int findMinEvenNumber(int[] numbers) {
        int ans = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && (ans == -1 || numbers[i] < ans)) {
                ans = numbers[i];
            }
        }
        return ans;
    }

    public static List<String> shortWords(String[] words) {
        int minL = words[0].length();
        for (String w : words) {
            if (w.length() < minL) {
                minL = w.length();
            }

        }
        List<String> ans = new ArrayList<>();
        for (String w : words) {
            if (w.length() == minL) {
                ans.add(w);
            }
        }
        return ans;
    }

    public static int findWater(int[] h) {
        int maxPos = 0;
        for (int i = 0; i < h.length; i++) {
            if (h[i] > maxPos) {
                maxPos = i;
            }
        }
        int ans = 0;
        int nowmax = 0;
        for (int i = 0; i < maxPos; i++) {
            if (h[i] > nowmax) {
                nowmax = h[i];
            }
            ans += nowmax - h[i];
        }
        nowmax = 0;
        for (int i = h.length - 1; i > maxPos; i--) {
            if (h[i] > nowmax) {
                nowmax = h[i];
            }
            ans += nowmax - h[i];
        }
        return ans;
    }

    public static String rle (char[] s) {
        char lastsym = s[0];
        int lastpos = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < s.length; i++) {
            if (s[i] != lastsym) {
                ans.append(pack(lastsym, i-lastpos));
                lastpos = i;
                lastsym = s[i];
            }
        }
        ans.append(pack(s[lastpos], s.length - lastpos));
        return ans.toString();
    }

    public static String pack(char s, int count) {
        if (count > 1) {
            return String.valueOf(s) + count;
        }
        return String.valueOf(s);
    }
}
