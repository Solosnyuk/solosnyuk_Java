import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }

    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean leftHappy = (i > 0) && (str.charAt(i - 1) == 'g');
                boolean rightHappy = (i < str.length() - 1) && (str.charAt(i + 1) == 'g');

                if (!leftHappy && !rightHappy) {
                    return false;
                }
            }
        }
        return true;
    }

    public String notReplace(String str) {
        return str.replaceAll("(?<![a-zA-Z])is(?![a-zA-Z])", "is not");
    }

    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
    }
}

