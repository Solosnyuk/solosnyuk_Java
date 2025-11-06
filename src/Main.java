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

    public static List<String> filtrList(List<String> list) {
        return list.stream()
                .filter(word -> word.length() < 5)
                .map(word -> word.toUpperCase())
                .toList();
    }

    public static Map<String, List<String>> groupEmployee(List<String> list) {
        list.stream()
                .collect(Collectors.groupingBy(
                       list::getOtdel
                ));
    }

    public static Employee maxSalary(List<Employee> list) {
        return list.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow();
    }

    public static Integer avgInt(int[] ints) {
        return (int) Arrays.stream(ints)
                .average()
                .orElse(0);
    }

    public static boolean checkUpper(List<String> list) {
        return list.stream()
                .allMatch(word -> Character.isUpperCase(word.charAt(0)));
    }

    public static List<Integer> sort(List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder()                )
                .toList();
    }

    public static String firstMath(List<String> list, String s) {
        return list.stream()
                .filter(word -> word.contains(s))
                .findFirst()
                .orElse(null);
    }
}