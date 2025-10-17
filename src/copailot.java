import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class copailot {
    public static char searchUniq(String string) {
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (string.replaceAll(String.valueOf(ch), "").length() == string.length() - 1) {
                return ch;
            }
        }
        return ' ';
    }

    public static boolean balans(String strings) {
        for (int i = 0; i < strings.length() / 2; i++) {
            char first = strings.charAt(i);
            char last = strings.charAt(strings.length() - i);

            if (first == '(' && last == ')') {
                continue;
            } else if (first == '[' && last == ']') {
                continue;
            } else if (first == '{' && last == '}') {
                continue;
            }
            return false;
        }
        return true;
    }

    public static int[] sortDoble(int[] ints, int[] ints2) {
        return IntStream.concat(Arrays.stream(ints), Arrays.stream(ints2))
                .sorted()
                .toArray();
    }

    public static void parInt(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[i] + arr[j] == n){
                    System.out.println(arr[i] + " " + arr[j] + "\n");
                }
            }
        }
    }
    public static String deleteTrim(String str) {
        return str.trim();
    }

    public static boolean prostoe(int n) {
        int count = 0;

        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return (count > 2)? false : true;
    }

    public static Map<String, Integer> countWord(String string) {
        Map<String, Integer> map = new HashMap<>();
        String[] strings = string.split(" ");

        for (String s : strings) {
            map.put(s,map.getOrDefault(s,0) +1);
        }
        return map;
    }


}
