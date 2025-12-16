package zadacaOne;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public static Map<String,List<Employee>> sortEmployee(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.getDepartament()
                ));
    }

    public static Product maxSalary(List<Product> productList) {
        return productList.stream()
                .max(Comparator.comparingInt(
                        Product::getCost
                ))
                .orElseThrow();
    }

    public static Integer uniqWord(List<String> stringList) {
        return Math.toIntExact(stringList.stream()
                .map(String::toLowerCase)
                .distinct()
                .count());
    }

    public static List<String> getTopNFrequentWords(List<String> words, int n) {
        return words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(n)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static Map<String, List<Product>> getProductsByCategory(List<Order> orders) {
        return orders.stream()
                .flatMap(order -> order.products().stream())
                .collect(Collectors.groupingBy(Product::category));
    }

    public static Map<Integer, List<Integer>> groupByDigitSum(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.groupingBy(
                        NumberProcessor::sumOfDigits
                ));
    }
}
