import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.temporal.ValueRange;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

    }

    public static Map<String, List<String>> filterGroupMap(List<String> list) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : list) {
            String city = s.substring(0,s.indexOf(':'));
            String name = s.substring(s.indexOf(':') + 1);

            List<String> names = map.getOrDefault(city, new ArrayList<>());
            names.add(name);
            map.put(city, names);
        }
        return map;
    }

    public static Integer maxEvenInt(List<Integer> list) {
        return list.stream()
                .filter(num -> num % 2 == 0)
                .max(Comparator.naturalOrder())
                .orElse(null);
    }

    public static String conString(List<String> list) {
        return "["+ String.join("; ", list) + "]";
    }

    public static List<String> sortLegthList(List<String> list) {
        return list.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
    }

    public static List<String> sortAlphabeatList(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .toList();
    }

    public static Integer sumEvInteger(List<Integer> list) {
        return list.stream()
                .filter(num -> num % 3 == 0 && num % 5 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static Map<String, Integer> countWordMap(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
    }
}