import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }

    public static LinkedList<String> distinctLinked(List<String> list) {
        return (LinkedList<String>) list.stream()
                .distinct()
                .toList();
    }

    public static Map<String, Long> mapCount(String string) {
        return Arrays.stream(string.split(" "))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
    }

    public static List<Person> sortList(List<Person> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .toList();
    }

    public static List<String> uniqElement(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        string -> string,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
    }

    public static List<String> dubl(List<String> stringList, List<String> strings) {
        return Stream.concat(stringList.stream(), strings.stream())
                .distinct()
                .toList();
    }

    public static <T> List<T> reversList(List<T> tList) {
        List<T> tList1 = new ArrayList<>(tList);
        Collections.reverse(tList1);
        return tList1;
    }

    public static List<String> topTrhee(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                    string -> string,
                    Collectors.counting()
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}