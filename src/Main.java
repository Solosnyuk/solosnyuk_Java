import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> integerList = new ArrayList<>();
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();

        for (int num : elements) {
            integerIntegerMap.put(num,integerIntegerMap.getOrDefault(num,0) + 1);
            if (maxOccurrences >= integerIntegerMap.get(num)){
                integerList.add(num);
            }
        }

        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] removeSmallest(int[] numbers) {
        int minIndex = Arrays.stream(numbers).min().getAsInt();

        return IntStream.range(0, numbers.length)
                .filter(i -> i != minIndex)
                .map(i -> numbers[i])
                .toArray();
    }

    public static int findAverage(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        return sum / nums.length;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeSmallest(new  int[]{2, 3, 4, 5})));

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

