import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String smile : arr) {
            if (smile.matches("[:;][-~]?[)D]")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        System.out.println(countSmileys(a));

    }
}
