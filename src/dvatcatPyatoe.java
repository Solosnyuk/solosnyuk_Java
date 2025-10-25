import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dvatcatPyatoe {
    public static List<Integer> deletDubl(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static Map<String, Integer> countWord(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : list) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map;
    }

    public static String maxLegth(List<String> list) {
        return list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElseThrow();
    }

    public static List<Integer> evenNum(List<Integer> list) {
        return list.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> listToLegth(List<String> list) {
        return list.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    public static List<String> duplList(List<String> list, List<String> stringList) {
        return Stream.concat(list.stream(), stringList.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> sordLegth(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }

    public static List<String> emptyDel(List<String> list) {
        return list.stream()
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());
    }

    public static String joinList(List<Integer> list) {
        return list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }

    public static Boolean minusChek(List<Integer> list) {
        return list.stream()
                .anyMatch(num -> num < 0);
    }
}
