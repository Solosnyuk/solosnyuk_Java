import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
                .ifPresent (value -> System.out.println(value));
    }

}