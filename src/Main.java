import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    //Напишите код, который профильтрует дублирующиеся элементы
    // в массиве и выведет их в виде списка.
    public static List<Integer> duplicate(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        return map.entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    //Дайте пример кода, который сортирует
    // список строк с использованием коллекции.

    public static void showList(String[] array) {
       Arrays.sort(array);
    }

    //Напишите функцию, которая переворачивает число
    // (порядок цифр в нем изменяет на противоположный, инвертирует).
    public static long doInvert(long number) {
        long result = 0;
        while (number > 0){
            long dig = number % 10;
            result = result * 10 + dig;
            number = number / 10;
        }

        return result;
    }

    // Напишите метод проверки, является ли введенное число простым числом
    public static boolean checkPrime(int n) {
        return BigInteger.valueOf(n).isProbablePrime(10);
    }

    //Напишите метод поиска двух самых больших значений в массиве.
    public static int[] getTwoMaxValues(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // Напишите код, который удаляет из строки лишние пробелы.
    public  static String deletS(String input) {
        return input.replaceAll(" +", " ");
    }

    // Напишите код, проверяющий, является ли введенное число палиндромом
    public static Boolean chekPalindrom(int num){

        return true;
    }


    public static void main(String[] args) {
        System.out.println();
    }
}

