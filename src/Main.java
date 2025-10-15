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
}