import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public static List<String> uniqStrig(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
    }

    public static Map<Integer, Long> mapCount(List<Integer> integerList) {
        return integerList.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.summingLong(e -> 1)
                ));
    }

    public static Integer avgSalary(List<Employee> employeeList) {
        return (int) employeeList.stream()
                .filter(employee -> employee.getAge() > 30)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
    }

    public static Map<String, Integer> countMap(Map<String, Integer> map, Map<String, Integer> integerMap) {
        for (Map.Entry<String, Integer> entry : integerMap.entrySet()) {
            map.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return map;
    }

    public static List<Product> priceLow(List<Product> list) {
        return list.stream()
                .filter(product -> product.getPrice() < 100)
                .toList();
    }

    public static Map<Character, List<String>> groupChar(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        string -> string.charAt(0)
                ));
    }

    public static Integer maxInt(int[] arr) {
        return Arrays.stream(arr)
                .max()
                .getAsInt();
    }


}