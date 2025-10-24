import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] filterConvert(String[] arr) {
        return Arrays.stream(arr)
                .filter(word -> word.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    public static void sortEmploye(List<Employe> list) {
        Map<String, DoubleSummaryStatistics> depart = list.stream()
                .collect(Collectors.groupingBy(Employe::getDepartament,
                        Collectors.summarizingDouble(Employe::getSalary)));

        for (Map.Entry<String, DoubleSummaryStatistics> stringDoubleSummaryStatisticsEntry : depart.entrySet()) {
            System.out.println(stringDoubleSummaryStatisticsEntry);
        }
    }

    public static LinkedHashSet<Integer> sortFilter(List<Integer> list) {
        Map<Integer, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return list.stream()
                .filter(n -> frequencyMap.get(n) > 1)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }


}