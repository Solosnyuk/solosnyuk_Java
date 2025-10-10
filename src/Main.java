import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.range;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(arr)));
    }

    public static String highAndLow(String numbers) {
        Integer[] integers = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        int max = Arrays.stream(integers).max(Integer::max).orElse(0);
        int min = Arrays.stream(integers).min(Integer::min).orElse(0);

        return max + " " + min;
    }

    public static int sortDesc(final int num) {
        String[] strings = String.valueOf(num).split("");
        Arrays.sort(strings, Collections.reverseOrder());
        return Integer.valueOf(String.join("", strings));
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(n -> n instanceof Integer).collect(Collectors.toList());
    }

    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(n -> n * -1).toArray();
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0){
            return new int[0];
        }
        int countPositive = (int) Arrays.stream(input).filter(n -> n > 0).count();
        int countNegative = Arrays.stream(input).filter(n -> n < 0).sum();
        return new int[]{countPositive, countNegative};
    }

    public static int[] removeSmallest(int[] numbers) {
        int min = Arrays.stream(numbers).min().orElse(0);

        return range(0, numbers.length)
                .filter(i -> i != min)
                .map(i -> numbers[i])
                .toArray();
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : elements) {
            map.put(num, map.getOrDefault(num, 0) +1);
            if (map.get(num) <= maxOccurrences){
                list.add(num);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}