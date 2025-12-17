package zadacaOne;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            var runnable = new MyThread(i);
            var thread = new Thread(() -> {
                System.out.println("hello");
            });
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Map<String, List<Employee>> sortEmployee(List<Employee> employeeList) {
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

    public static Map<String, List<Employee>> groupDepartament(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(
                                Employee::getDepartament
                        )
                );
    }

    public static Product maxCostProduct(List<Product> productList) {
        return productList.stream()
                .max(Comparator.comparingInt(
                                Product::getCost
                        )
                )
                .orElseThrow();
    }

    public static Integer countUniqWord(String stringWord) {
        return Arrays.asList(stringWord.split(" "))
                .stream()
                .collect(Collectors.toSet())
                .size();
    }

    public static List<Student> sortGradeStudent(List<Student> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparingDouble(
                                student -> student.getGrades().stream()
                                        .mapToInt(Integer::intValue)
                                        .average
                                        .orElse(0)
                        )
                        .reversed())
                .collect(Collectors.toList()
                );
    }
}
