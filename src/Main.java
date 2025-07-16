import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.IntStream.iterate;

public class Main {
    public int solve(int x, int y) {
        int count = 0;
        for (Integer i = x; i < y; i++) {
            boolean turn = true;
                if (i.toString().matches("[2,3,4,5,7,9]")){
                    turn = false;
                }
                if (turn){
                    count++;
                }
        }
        return count;
    }

        public static void main(String[] args) {
            System.out.println();
    }
}
