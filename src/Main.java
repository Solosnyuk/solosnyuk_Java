import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.temporal.ValueRange;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ii", "i", "iiiiiiiiiiiii");
        System.out.println(sortGlasnii(list));

    }

    public static String concatList(Collection<String> list) {
        return list.stream()
                .collect(Collectors.joining(" "));
    }

    public static String reversString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static Integer uniqChar(String string) {
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : string.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size();
    }

    public static long sumQadrNum(Collection<Integer> collection) {
        return collection.stream()
                .mapToLong(n -> (long) n * n)
                .sum();
    }

    public static String firstBigBeat(List<String> list) {
        return list.stream()
                .filter(word -> Character.isUpperCase(word.charAt(0)))
                .findFirst()
                .orElse("Нету строк");
    }

    public static String delTrim(String string) {
        return string.trim();
    }

    public static List<String> alphabeatSort(List<String> list) {
        return list.stream()
                .sorted(String::compareToIgnoreCase)
                .toList();
    }

    public static String delGlas(String string) {
        return string.replaceAll("[aeiuo]", "");
    }

    public static List<String> preobNumber(List<Integer> list) {
        return list.stream()
                .map(num -> "#" + num)
                .toList();
    }

    public static Map<String, Long> findM(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }

    public static List<Integer> bolleeOdnogo(List<Integer> list) {
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        List<Integer> list1 = new ArrayList<>();

        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                list1.add(entry.getKey());
            }
        }
        return list;
    }

    public static List<String> sortGlasnii(List<String> list) {
        Map<String, Long> map = new LinkedHashMap<>();

        for (String string : list) {
            Long raz = Arrays.asList(string.toLowerCase().toCharArray()).stream()
                    .filter(w -> w.equals("[aiuoe]"))
                    .count();
            map.put(string, raz);
        }
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .toList();
    }

    public static List<String> sortEmployee(List<Employee> list) {
        return list.stream()
                .filter(employee -> employee.getAge > 30 && "Developer".equals(employee.getStatus))
                .map(Employe::getName)
                .collect(Collectors.toList());
    }

    public static Integer countUniq(String string) {
        return Arrays.stream(string.split(" "))
                .map(word -> word.toLowerCase().replaceAll("[,./')(]", ""))
                .map(word -> !word.isEmpty())
                .collect(Collectors.toSet())
                .size();
    }

    public static Map<Status, List<Order>> mapOrder(List<Order> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Order::getStatus));
    }
}