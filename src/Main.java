import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }

    public static String reversString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static Boolean palindromChek(String string) {
        String reversStr = new StringBuilder(string).reverse().toString();
        return string.equals(reversStr);
    }

    public static BigInteger factorial(int n) {
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static Integer searchTwoMax(int[] arr) {
        return Arrays.stream(arr)
                .max()
                .getAsInt();
    }

    public static List<String> removeDuplicate(List<String> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
        }
    }

    public static boolean anagramCheck(String one, String two) {
        char[] chars = one.toCharArray();
        char[] chars2 = two.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars2);

        return Arrays.equals(chars, chars2);
    }

    public static Map<Character, Integer> sortChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) +1);
        }

        return map;
    }


    
}