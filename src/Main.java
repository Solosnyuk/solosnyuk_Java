import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.rangeClosed;

public class Main {
    public static int[] pipeFix(int[] numbers) {
        return rangeClosed(numbers[0],numbers[numbers.length - 1]).toArray();
    }

    public static Object[] removeEveryOther(Object[] arr) {
        return IntStream.range(0, arr.length)
                .filter(n -> n % 2 == 0)
                .mapToObj(i->arr[i]).toArray();
    }

    public static int[] monkeyCount(final int n){
        return IntStream.range(0,n).toArray();

    }

    public static int[] countPositivesSumNegatives(int[] input){

        if (input.length == 0 || input == null){
            return new int[]{};
        }

        int posCount = (int) Arrays.stream(input).filter(n-> n > 0).count();
        int sumNeg = (int) Arrays.stream(input).filter(n -> n < 0).sum();
        return new int[]{posCount,sumNeg};
    }

    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(n -> n * -1).toArray();

    }

    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }

    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(t -> t * t).sum();
    }

    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(n -> n > 0).sum();
    }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(invert(new int[]{1, 2, 3, 4, 5})));

        }
    }

