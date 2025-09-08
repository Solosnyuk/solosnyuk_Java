import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int sumNumbers(String str) {
        int sum = 0;
        String string = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                    string += str.charAt(i);
            }else{
                if (!string.isEmpty()) {
                    sum += Integer.parseInt(string);
                    string = "";
                }
            }
        }
        return sum;
    }

    public static String mirrorEnds(String string) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                result += string.charAt(i);
            } else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
            System.out.println(mirrorEnds("abcda"));
    }
}

