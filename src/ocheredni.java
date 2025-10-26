import java.util.*;
import java.util.stream.Collectors;

public class ocheredni {
    public static Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
        Map<Integer, List<String>> map1 = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            List<String> list = map1.getOrDefault(entry.getKey(), new ArrayList<>());
            list.add(entry.getKey());
            map1.put(entry.getValue(), list);
        }

        return map1;
    }

    public static Integer sumEvenNum(List<Integer> list) {
        return list.stream()
                .filter(num -> num % 2 == 0)
                .reduce(Integer::sum)
                .orElseThrow();
    }

    public static List<String> searchTest(List<String> list) {
        return list.stream()
                .map(word -> word.toLowerCase())
                .filter(word -> word.contains("test"))
                .collect(Collectors.toList());
    }

    public static List<String> delNull(List<String> list) {
        return list.stream()
                .filter(word -> word != null)
                .collect(Collectors.toList());
    }

    public static Integer maxTwoInt(List<Integer> list) {
        list.remove(list.stream()
                .max(Integer::compareTo)
                .orElseThrow());

        return list.stream()
                .max(Integer::compareTo)
                .orElseThrow();
    }

    public static List<Boolean> evenOrN(List<Integer> list) {
        return list.stream()
                .map(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    public static Integer uniqWord(List<String> list) {
        return (int) list.stream()
                .distinct()
                .count();
    }

    public static LinkedHashMap<String, Integer> sortMap(Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public static String concList(List<String> list) {
        return list.stream()
                .collect(Collectors.joining(";"));
    }

    public static List<String> sredneeLegth(List<String> list) {
        double avg = list.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);

        return list.stream()
                .filter(word -> word.length() > avg)
                .collect(Collectors.toList());
    }
}
