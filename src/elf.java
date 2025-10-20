import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class elf {
    public static List<String> filterWord(List<String> list) {
        return list.stream()
                .filter(word -> word.length() >= 7 && Character.isUpperCase(word.charAt(0)))
                .collect(Collectors.toList());
    }

    public static String searchMaxLegth(String[] strings) {
        return Arrays.stream(strings)
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public static Map<String, Integer> sortedMap(Map<String, Integer> map) {
        return (Map<String, Integer>) map.entrySet().stream()
                .sorted();
    }

    public static Set<Character> uniqChar(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
    }

    public static List<String> concatList(List<String> list, List<String> strings) {
        return Stream.concat(list.stream(), strings.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static Integer vtoroiMax(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
    }

    public static String cojoin(List<String> list) {
        return list.stream().collect(Collectors.joining(","));
    }
}
