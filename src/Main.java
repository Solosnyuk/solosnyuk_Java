import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int sumOfElements(int matrix[][]) {
        int summ = 0;
        for (int i = 0; i < matrix.length; i ++) {
            for (int cislo : matrix[i]) {
                summ += cislo;
            }
        }
        return summ;
    }

    public static void main(String[] args) {
        String stringAf = "wwwwwwz";
        int[][] value = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumOfElements(value));
    }
}