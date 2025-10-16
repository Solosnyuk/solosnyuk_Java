import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    }

    public static Map<String, Integer> povtor(String str) {
        Map<String, Integer> res = new HashMap<>();
        String[] arrStr = str.split("[ _,.]");

        for (String string : arrStr) {
            res.put(string, res.getOrDefault(string, 0) + 1);
        }

        return res;
    }

    public static List<String> deletDuplicate(List<String> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<User> sortAge(List<User> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    public static String revers(String string) {
        String[] arr = string.split(" ");
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        return String.join(" ", list);
    }

    public static BigInteger factorial(int n) {
        return factorial(n - 1);
    }

    public static Map<String, Integer> searchDuplicate(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : list) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        return map;
    }

    public static List<String> removeDuplicate(List<String> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static boolean anagram(String string, String silent) {
        if (string.length() != silent.length()) {
            return false;
        }

        char[] chars = string.toCharArray();
        char[] chars2 = silent.toCharArray();

        return Arrays.equals(chars,chars2);
    }

    public static String searchMaxLengthWord(String string) {
        String[] strings = string.split(" ");

        return Arrays.stream(strings)
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public static List<String> sortList(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }
}