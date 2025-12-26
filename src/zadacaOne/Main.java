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
                            Book::getName,Collectors.toList()
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

    public static List<String> filterStudent(Map<String, Integer> stringIntegerMap) {
        return stringIntegerMap.entrySet().stream()
                .filter(student -> student.getValue() > 80)
                .sorted(Comparator.comparingInt(Map.Entry::getValue).reversed())
                .map(Map.Entry::getKey)
                .toList();
    }
}
