package zadacaOne;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


    }

    public static LinkedList<String> wordFive(List<String> stringList) {
        return stringList.stream()
                .filter(word -> word.length() >= 5)
                .map(word -> word.toUpperCase())
                .sorted()
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public static Map<Integer, Long> countNum(List<Integer> integerList) {
        return integerList.stream()
                .collect(Collectors.groupingBy(
                                integer -> integer,
                                Collectors.counting()
                        )
                );
    }

    public static Map<String, List<String>> groupAuthor(List<Book> bookList) {
        return bookList.stream()
                .collect(Collectors.groupingBy(
                                Book::getAothor,
                                Collectors.mapping(
                                        Book::getName, Collectors.toList()
                                )
                        )
                );
    }

    public static Employee maxSalary(List<Employee> employeeList) {
        return employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow();
    }

    public static LinkedHashSet<String> stringList(List<String> stringList) {
        return stringList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    //public static List<String> filterStudent(Map<String, Integer> stringIntegerMap) {
    //    return stringIntegerMap.entrySet().stream()
    //            .filter(student -> student.getValue() > 80)
    //            .sorted(Comparator.comparingInt(Map.Entry::getValue).reversed())
    //            .map(Map.Entry::getKey)
    //            .toList();
    //}

    public static Map<Character, Long> countUniqSymbol(String string) {
        return string.chars()
                .mapToObj(c -> (char) c) // преобразуем в Character
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));
    }


    public static List<Integer> topN(List<Integer> integerList) {
        if (integerList.size() < 3) {
            return integerList.stream()
                    .sorted()
                    .toList();
        }
        return integerList.stream()
                .sorted()
                .limit(3)
                .toList();
    }

    public static Map<Character, List<String>> groupFirstBeat(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(
                                w -> w.charAt(0),
                                Collectors.toList()
                        )
                );
    }

    public static Map<String, Double> groupProduct(List<Product> productList) {
        return productList.stream()
                .collect(Collectors.groupingBy(
                        p -> p.getCategory(),
                        Collectors.summingDouble(Product::getPrice)
                ));
    }

    public static String maxLengthWord(List<String> stringList) {
        return stringList.stream()
                .sorted(
                        Comparator
                                .comparingInt(String::length)
                                .reversed()
                )
                .limit(1)
                .toString();
    }

}
