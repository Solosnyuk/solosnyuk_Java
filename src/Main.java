import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static int getCount(String str) {
        int lengStr = str.length();
        int newLength = str.toLowerCase().replaceAll("[aeiou]","").length();
        return lengStr - newLength;
    }

    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }

    public static int solution(int number) {
        int sum = 0;
        for (int i = number - 1; i > 0; i--) {
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> integerList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());

        integerList.removeAll(listB);

        return integerList.stream().mapToInt(e -> e).toArray();
    }

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        List<String> res = new ArrayList<>();

        for (String word : words) {
            if (word.length() >= 5){
                res.add(new StringBuilder(word).reverse().toString());
            }
            else {
                res.add(word);
            }
        }
        return String.join(" ", res);
    }

    public static void main(String[] args) {
        System.out.println(solution(10));


        List<Model> modelList = new ArrayList<>(
                Arrays.asList(
                        new Model(10),
                        new Model(15),
                        new Model(10),
                        new Model(2)
                )
        );

        Map<Model, Integer> countModel = new HashMap<>();

        for (Model model : modelList) {
            countModel.put(model,countModel.getOrDefault(model,0) + 1);
        }

        countModel.entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .forEach(n -> System.out.println(n.getKey()));
    }
}

