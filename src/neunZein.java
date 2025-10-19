import jdk.dynalink.linker.LinkerServices;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class neunZein {
    public static List<Integer> sortAndFiltr(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
    }

    public static Integer podschet(List<String> list) {
        return (int) list.stream()
                .distinct()
                .count();
    }

    public static Map<Integer, List<String>> group(List<String> list) {
        Map<Integer, List<String>> map = new HashMap<>();
        return list.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    public static String searchMaxLength(List<String> list) {
        return list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public static String concatWord(String[] strings) {
        return Arrays.stream(strings)
                .filter(word -> !word.isEmpty())
                .collect(Collectors.joining(","));
    }

    public static long sumQadroPositive(List<Integer> list) {
        return list.stream()
                .filter(n -> n > 0)
                .map(n -> n * n)
                .collect(Collectors.summingInt(Integer::intValue));
    }

    public static List<String> preobrPerson(List<Person> list) {
        return list.stream()
                .filter(person -> person.getAge() >= 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public static boolean chekNegative(List<Integer> list) {
        return list.stream().anyMatch(n -> n < 0);
    }

}
