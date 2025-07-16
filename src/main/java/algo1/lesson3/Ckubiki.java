package algo1.lesson3;
//Scanner -> BufferedReader + StringTokenizer System.println -> PrintWriter

import java.io.*;
import java.util.*;

public class Ckubiki {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> all = new HashSet<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = bufferedReader.readLine();

            String[] s2 = s.split(" ");
            int n = Integer.parseInt(s2[0]);
            int m = Integer.parseInt(s2[1]);

            for (int i = 0; i < n + m; i++) {
                String xx = bufferedReader.readLine();
                int x = Integer.parseInt(xx);
                if (i < n) {
                    a.add(x);
                } else {
                    if (a.contains(x)) {
                        all.add(x);
                        a.remove(Integer.valueOf(x));
                    } else {
                        b.add(x);
                    }
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.exit(0);
        }


    Set<Integer> aa = new TreeSet<>();
        aa.addAll(a);

    Set<Integer> bb = new TreeSet<>();
        bb.addAll(b);

    Set<Integer> alll = new TreeSet<>();
        alll.addAll(all);

    print(alll);
    print(aa);
    print(bb);
}

    public static void print(Set<Integer> set) {
        int size = set.size();
        System.out.println(size);
        StringBuilder st = new StringBuilder();
        if (size > 0) {
            for (Integer i : set) {
                st.append(i);
                st.append(" ");
            }
        }
        System.out.println(st);
    }
}


