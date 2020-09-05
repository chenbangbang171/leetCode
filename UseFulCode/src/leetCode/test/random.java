package leetCode.test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class random {

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();

        Random thdRnd = new Random();
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++) {
            if (ThreadLocalRandom.current().nextInt(n) < n / 2) {
                low++;
            }
//            if (thdRnd.nextInt(n) < n / 2) {
//                low++;
//            }
        }



        Long end = System.currentTimeMillis();

        System.out.println(low + "  " +  (end - start));

    }

//    public static int  Random(int n){
//         Random rnd = new Random();
//        return Math.abs(rnd.nextInt()) % n;
//    }

}
