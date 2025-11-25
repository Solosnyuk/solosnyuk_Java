package zadacaOne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
}
