import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }
    public static Integer maxInt(int[] arr) {
        return Arrays.stream(arr)
                .max()
                .getAsInt();
    }

    public static boolean palindromCheck(String s, String sTwo) {
        return sTwo.equals(new StringBuilder(s).reverse());
    }

    public static int[] reverArr(int[] arr) {
        return IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();
    }

    public static List<Integer> povtorList(List<Integer> list) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (Integer i : list) {
            if (!hashSet.add(i)) {
                duplicate.add(i);
            }
        }
        return duplicate.stream()
                .toList();
    }

    public static List<Integer> distDup(List<Integer> list) {
        return list.stream().distinct().toList();
    }

    public static boolean easyNum(Integer intege) {
        int countNum = 0;
        for (int i = 2; i < intege / 2; i++) {
            if (intege % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer countGlasnaya(String list) {
        return (int) list.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiouAEIOUауоыиэяюёеАУОЫИЭЯЮЁЕ".indexOf(c) != -1)
                .count();
    }

    public static Integer twoMaxNum(List<Integer> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct() // если нужно второе уникальное максимальное
                .skip(1)
                .findFirst()
                .orElseThrow();
    }
}