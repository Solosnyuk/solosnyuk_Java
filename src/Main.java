import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void bublSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - 1 - i; j++){
                if (sortArr[j] > sortArr[j + 1]) {
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sortArr));
    }

    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        bublSort(sortArr);
    }
}
