import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Povtor {
    public static List<String> deletDuplicate(List<String> list) {
        return list.stream().distinct()
                .collect(Collectors.toList());
    }

    public static List<String> sortLegth(Collection<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    public static Map<Character, List<String>> group(Collection<String> stringCollector) {
        return stringCollector.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0)
                ));
    }


}
