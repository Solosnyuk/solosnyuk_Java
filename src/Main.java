import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static int substringCount(String fullText, String search) {
        int count = 0;
        for (int i = 0; i < fullText.length(); i++) {
            if (fullText.startsWith(search, i)) {
                i += search.length() - 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 53421;
        String str = "2plus2plus3plus4";
        System.out.println(substringCount("aa_bbb_cc_dd_b_e","bb"));
    }
}
