import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
        public static int getCount(String str) {
           return  (int) str.toLowerCase().chars()
                    .filter(c -> "aeiou".indexOf(c) != -1)
                    .count();
        }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static int squareDigits(int n) {
        int[] digits = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        return Integer.parseInt(Arrays.stream(digits)
                .map(v -> v * v)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));
    }

    public static String highAndLow(String numbers) {
        int[] nums = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = Arrays.stream(nums).max().orElseThrow();
        int min = Arrays.stream(nums).min().orElseThrow();
        return max + " " + min;
    }

    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

        public static void main(String[] args) {
            System.out.println(sortDesc(15));
        }
    }

