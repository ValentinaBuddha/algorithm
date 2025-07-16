package algo1.lesson3;

import java.util.*;

public class BcountNumbersTwoLists {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arr2 = Arrays.stream(s.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int a : arr) {
            set.add(a);
        }

        for (int a : arr2) {
            if (set.contains(a)) {
                result.add(a);
            }
        }
        Collections.sort(result);
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < result.size() - 1; i++) {
            st.append(result.get(i));
            st.append(" ");
        }
        st.append(result.get(result.size() - 1));
        System.out.println(st);
    }
}
