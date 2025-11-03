import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.temporal.ValueRange;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {


    }

    public static Map<String, List<String>> filtrAndGroup(List<User> list) {
        return list.stream()
                .filter(user -> user.getAge() > 30)
                .collect(Collectors.groupingBy(User::getCity));
    }

    public static Order maxElement(List<Order> list) {
        return list.stream()
                .filter(order -> "PAID".equals(order.getStatus()))
                .max(Comparator.comparingInt(Objects::getAmount))
                .orElse(null);
    }

    public static String strString(List<String> list) {
        String s = list.stream()
                .collect(Collectors.joining("; "))
                .toString();

        return "[" + s + "]";
    }

    public static List<String> uniqList(List<String> list) {
        return list.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
    }

    public static List<Employee> sortEmployeeList(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Comparator.comparingInt(Employee::getSalary).reversed()))
                .toList();
    }

    public static Map<String, Integer> countMap(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
    }
}