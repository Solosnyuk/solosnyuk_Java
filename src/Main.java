import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void findCountElemAboveAvg(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]){
                    int sec = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = sec;
                }
            }
        }
    }

    public static double findSumAvgLines(int[][] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int dec : arr[i]) {
                sum += dec;
            }
        }
        return Math.round(sum/ arr.length * 10) / 10.0;
    }

    public static double findAvgOddElem(int[][] arr){
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int num : arr[i]) {
                if (num % 2 != 0){
                    count++;
                    sum += num;
                }
            }
        }

        if (count == 0){
            return 0;
        }
        return Math.round(sum/count * 10)/ 10.0;
    }

    public static int [] shiftValuesInArr(int[] arr, int shift) {
        for (int i = 0; i < shift; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0 ; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;
    }

    public static int[] findIndexAndValue(int[] arr) {
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        double srednee = (double) sum / 5;
        double dif = Double.MAX_VALUE;
        int[] dep = new int[2];

        for (int i = 0; i < arr.length; i++) {
            double curentDif = Math.abs(arr[i] - srednee);
            if (dif > curentDif){
                dif = curentDif;
                dep[0] = i;
                dep[1] = arr[i];
            }
        }
        return dep;
    }

    public static void changeSignForElem(int k, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0){
                arr[i] = arr[i] * -1;
            }
        }
    }

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(n -> n * 2).toArray();
    }

    public static String findNeedle(Object[] haystack) {
        String needle = "needle";
        for (int i = 0; i < haystack.length; i++) {
            if (needle.equals(haystack[i])) {
                return "found the needle at position " + i;
            }
        }
        return "needle not found";
    }

    public static int[] digitize(long n) {
        return new StringBuilder()
                .append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static int findEvenIndex(int[] arr) {
        int left = 0;
        int right = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++) {
            right -= arr[i];
            if (left == right){
                return i;
            }
            left += arr[i];
        }
        return -1;
    }

    public static double[] tribonacci(double[] s, int n) {
        double[] arr = new double[n];
        if (n < s.length){
            for (int i = 0; i < n; i++) {
                arr[i] = s[i];
            }
        }else{

        for (int i = 0; i < s.length; i++) {
            arr[i] = s[i];
        }
        }

        for (int i = s.length; i < n; i++) {
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
        }

        return arr;
    }

    public static long sumTwoSmallestNumbers(long[] numbers) {
        return Arrays.stream(numbers)
                .sorted()
                .limit(2)
                .sum();
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                .filter(Objects::nonNull)
                .filter(Boolean::booleanValue)
                .count();
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> bList = Arrays.stream(b)
                .boxed()
                .collect(Collectors.toList());
        return Arrays.stream(a)
                .filter(n -> !bList.contains(n))
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(arrayDiff(new int [] {1,2}, new int[] {1}));

    }

    }

