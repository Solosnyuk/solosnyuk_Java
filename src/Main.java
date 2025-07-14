import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.IntStream.iterate;

public class Main {
    public static int [][] multiplicationTable(int n){
        int[][] newArr = new int[n][n];
        for (int i = 1; i <= n; i++) {
            int countIn = i;
            for (int j = 0; j < n; j ++) {
                newArr[i - 1][j] = countIn;
                countIn += i;
            }
        }
        return newArr;
    }

    public static String sumStr(String a, String b){
        if (a.isEmpty()) {
            return b;
        }else if (b.isEmpty()){
            return a;
        } else if (a.isEmpty() && b.isEmpty()){
            return "0";
        }else {
            return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        }
    }


        public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiplicationTable(3)));
            System.out.println(sumStr("","1"));
    }
}
