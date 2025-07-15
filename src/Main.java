import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.IntStream.iterate;

public class Main {
        public static int findIt(int[] a) {
            Map<Integer,Integer> val = new HashMap<>();

            for (int i = 0; i < a.length; i++) {
                val.put(a[i], val.getOrDefault(a[i], 0) +1);
            }

            for (Map.Entry<Integer, Integer> entry : val.entrySet()) {
                if (entry.getValue() % 2 == 1){
                    return entry.getKey();
                }
            }

            return 0;
        }

        public static void main(String[] args) {
            System.out.println(findIt(new int[] {1,1,3,4,4,5,5}));
    }
}
