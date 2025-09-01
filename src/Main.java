import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static String wordAppend(String[] strings) {
        Map<String, Integer> count = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String word : strings) {
            count.put(word, count.getOrDefault(word, 0) + 1);
            if (count.get(word) % 2 == 0) {
                result.append(word);
            }
        }
        return result.toString();
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> count = new HashMap<>();
        Map<String, Boolean> countBoolean = new HashMap<>();

        for (String word : strings) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (String s : count.keySet()) {
            if (count.get(s) >= 2){
                countBoolean.put(s, true);
            }else{
                countBoolean.put(s, false);
            }
        }
        return countBoolean;
    }

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(n -> !n.isEmpty())
                .filter(n -> !n.contains("yy"))
                .filter(n -> n.charAt(n.length() - 1) != 'y')
                .map(n -> n + "y")
                .collect(Collectors.toList());
    }

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .filter(n -> !String.valueOf(n).endsWith("2"))
                .collect(Collectors.toList());
    }

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n * n) + 10)
                .filter(n -> !String.valueOf(n).endsWith("6") ||
                                     !String.valueOf(n).endsWith("5"))
                .collect(Collectors.toList());
    }

    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(n -> n.length() != 3 || n.length() !=4)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
    }
}

