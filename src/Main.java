import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void RedroverSchool (int size) {

        for (int i = 0; i <= size; i ++) {
            System.out.println();

                for (int n = 0; n < i; n++) {
                    System.out.print("  ");
                }

            for (int j = 0; j <= size - i; j++) {
                System.out.print(j + " ");
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        RedroverSchool(9);
    }
}
