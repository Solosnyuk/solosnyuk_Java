package zadacaOne;

import java.util.*;
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

    public static List<Student> sortGrade(List<Student> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparingDouble(
                        student -> student.getGrade().stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0)
                ).reversed()) // если нужно от большего к меньшему
                .collect(Collectors.toList());
    }

}
