package zadacaOne;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public static Client findHigAgeClient(List<Client> clientList) {
        return clientList.stream()
                .filter(

                        c -> c.getPhoneList().stream()
                                .anyMatch(
                                        p -> p.getPhoneType() == PhoneType.STATIONARY
                                )
                )
                .max(Comparator.comparingInt(Client::getAge))
                .orElseThrow();
    }

    public static List<Integer> uniqList(List<Integer> integerList) {
        return integerList.stream()
                .distinct()
                .toList();
    }

    public static Map<String, Integer> countWord(String word) {
        return Arrays.stream(word.split(" "))
                .collect(Collectors.groupingBy(
                                wrd -> wrd,
                                Collectors.summingInt(w -> 1)
                        )
                );
    }

    public static List<User> sortUserAge(List<User> list, Integer age) {
        return list.stream()
                .filter(u -> u.getAge() > age)
                .toList();
    }

    public static List<Integer> nameToLengh(List<String> stringList) {
        return stringList.stream()
                .map(w -> w.length())
                .toList();
    }

    public static Map<Group, Integer> countGroup(List<User> userList) {
        return userList.stream()
                .collect(Collectors.groupingBy(
                                User::getGroup,
                                Collectors.summingInt(w -> 1)
                        )
                );
    }

    public static List<Product> lastCost(List<Product> productList, Integer cost) {
        return productList.stream()
                .filter(product -> product.getCost() > cost)
                .toList();
    }
}
