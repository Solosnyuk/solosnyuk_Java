import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,1,2);
        System.out.println(uniqInt(integerList));
    }

    public static Map<String, Long> countWord(List<String> wordList) {
        return wordList.stream()
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
    }

    public static List<String> sortLegth(List<String> list) {
        return  list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    public static Map<Character, List<String>> groupChar(List<String> wordList) {
        return wordList.stream()
                .collect(Collectors.groupingBy(
                    word -> word.charAt(0)
                ));
    }

    public static List<Integer> uniqInt(List<Integer> list) {
        List<Integer> listUniq = new ArrayList<>();
        Map<Integer, List<Integer>> mapCount = list.stream().
                collect(Collectors.groupingBy(
                        inter -> inter
                ));

        for (Map.Entry<Integer, List<Integer>> entry : mapCount.entrySet()) {
            if (entry.getKey() == 1){
                return entry.getValue();
            }
        }
        return null;
    }
}