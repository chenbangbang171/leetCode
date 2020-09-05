package leetCode.test;

import java.util.Comparator;

public class boxedPrimitive {

    public static void main(String[] args) {
//        System.out.println( natural.compare(42,42));

        long start = System.currentTimeMillis();
        Long sum = 0L;

        for (long i = 0; i < 10000000 ; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();

        System.out.println(sum  + "  " + (end - start));
    }

   static  Comparator<Integer> natural = (i, j)->(i < j) ? -1 : (i == j ? 0 : 1);
}
