import java.util.HashMap;
import java.util.Map;

public class Main {
        public boolean equalIsNot(String str) {
            int isCount = 0;
            int notCount = 0;

            for (int i = 0; i <= str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals("is")) {
                    isCount++;
                }
            }

            for (int i = 0; i <= str.length() - 3; i++) {
                if (str.substring(i, i + 3).equals("not")) {
                    notCount++;
                }
            }
            return isCount == notCount;
        }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (str.charAt(i - 1) == ch && str.charAt(i + 1) == ch){
                count++;
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return count;
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        String string = "0";
        Boolean key = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (key){
                    string = string + str.charAt(i);
                }
                key = true;
            }else{
                key = false;
                sum += Integer.valueOf(string);
                string = "0";
            }
        }

        return sum;
    }


        public static void main(String[] args) {
            System.out.println(sumNumbers("abc123xyz"));
    }
}

