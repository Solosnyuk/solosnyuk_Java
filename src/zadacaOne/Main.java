package zadacaOne;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "apricot", "orange", "avocado");
        List<Integer> numbers = Arrays.asList(3, 7, 2, 10, 15, 6, 8);
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3, 7);


    }

    public static List<Integer> uniqInt(List<Integer> integerList) {
        return integerList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    private static List<String> filterFirstA(List<String> list) {
        return list.stream()
                .filter(word -> word.charAt(0) == 'a')
                .toList();
    }

    public static List<Integer> sortAscInteger(List<Integer> integerList) {
        return integerList.stream()
                .map(integer -> integer * integer)
                .sorted()
                .toList();
    }

    public static Map<String, Double> avgSalaryDepartament(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartament,
                                Collectors.averagingInt(Employee::getSalary)
                        )
                );
    }
}
