import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n > 19 || n < 13)
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(word -> !word.contains("z"))
                .collect(Collectors.toList());
    }

    public void allEven(List<Integer> list) {
        list.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }

    public void hi18(List<Person> people) {
        people.stream()
                .filter(person -> person.age > 18)
                .forEach(System.out::println);
    }

    public void maxOld(List<Person> people) {
        people.stream()
                .max(Comparator.comparingInt(person -> person.age))
                .ifPresent(System.out::println);

    }

    public void sredniy(List<Person> people) {
        people.stream()
                .mapToInt(person -> person.age)
                .average()
                .ifPresent(value -> System.out.println(value));
    }

    public int evenNumCount(List<Integer> list) {
        return (int) list.stream()
                .filter(n -> n % 2 == 0)
                .count();
    }

    public String[] stringsToUpper(String[] strings) {
        return Stream.of(strings)
                .filter(num -> num.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .toArray(String[]::new);
    }

    public int number4(int[] ints) {
        return Arrays.stream(ints)
                .map(n -> n * n)
                .sum();
    }

    public List<Integer> deleteDuplicate(List<Integer> list) {
        return list.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    public void sort(List<String> list) {
        list.stream()
                .filter(word -> word.charAt(0) == 'C')
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }

    public int average(Map<String, Integer> map) {
        return (int) map.entrySet().stream()
                .mapToInt(m -> m.getValue())
                .average()
                .orElse(0);
    }

    public Map<String, Integer> maxMap(Map<String, Integer> map) {
        int max = map.values().stream().max(Integer::compare).orElse(0);

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue)
                );
    }

    public Map<String, Integer> addThenProcent(Map<String, Integer> map) {
        return map.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> (int) (entry.getValue() * 1.1)));
    }

    public int maxInteger(List<Integer> list) {
        return list.stream()
                .max(Integer::compare)
                .orElse(0);
    }

    public List<Integer> evelInteger(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> length(List<String> list) {
        return list.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    public List<String> removeDuplicate(List<String> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public String firstA(List<String> list) {
        return list.stream()
                .filter(word -> word.startsWith("A"))
                .findFirst()
                .orElse("Не найдено");
    }
}