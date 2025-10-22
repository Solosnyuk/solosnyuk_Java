import java.util.*;
import java.util.stream.Collectors;

public class Ocheredniye {
    public static boolean chekPalindrom(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }

    public static String deletTrim(String string) {
        return string.trim();
    }

    public static int sumArr(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public static int searchTwoMax(int[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("Array must contain at least two elements");

        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();
    }

    public static Object[] reversArr(Object[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    public static List<String> duplicateSearch(List<String> list) {
        Set<String> seen = new HashSet<>();

        return list.stream()
                .filter(word -> !seen.add(word))
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> oneListTwoList(List<String> list, List<String> stringList) {
        return list.stream()
                .filter(word -> stringList.contains(word))
                .collect(Collectors.toList());
    }

    public static List<Person> sortedPers(List<Person> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
    }

    public static int uniqCount(String string) {
        return (int) List.of(string.split(" ")).stream()
                .distinct()
                .count();
    }

    public static String[] arrGroupLegth(String[] strings) {
        return (String[]) Arrays.stream(strings)
                .sorted(Comparator.comparingInt(String::length))
                .toArray();
    }
}
