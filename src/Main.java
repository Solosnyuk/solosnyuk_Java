import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Первый", "второй", "Третий");


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
}