import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static String solution(int value) {
        return "Value is " + String.format("%05d", value);
    }

    public static void main(String[] args) {
        String stringAf = "Value is 00005";
        int value = 6;
        System.out.println(solution(value));
    }
}