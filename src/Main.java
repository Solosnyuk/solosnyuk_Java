import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static int[] zeroFront(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] == 0){
                    int dep = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = dep;
                }
            }
        }
        return nums;
    }

    public static int[] withoutTen(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10){
                nums[i] = 0;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] == 0){
                    int dep = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = dep;
                }
            }
        }
        return nums;
    }

    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                int maxEven = nums[i];

                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 != 0){
                        if (nums[j] > maxEven){
                            maxEven = nums[j];
                        }
                    }
                }

                nums[i] = maxEven;
            }

        }
        return nums;
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4){
                return false;
            }
        }
        return true;
    }

    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length - 1 ; i++) {
            if (nums[i] == 2){
                if (nums[i] != nums[i + 1]){
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public static int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                int maxLeft = val;
                int maxRight = val;
                if (i > 0 && i < nums.length - 1){
                    if (nums[i - 1] > nums[i]){
                        maxLeft = nums[i - 1];
                    }if (nums[i + 1] > nums[i]) {
                        maxRight = nums[i + 1];
                    }
                }
                nums[i] = (maxLeft > maxRight) ? maxLeft : maxRight;
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] % 2 != 0){
                    int dep = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = dep;
                }
            }
        }
        return nums;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] strings = new String[end - start];
        for (int j = start; j < end; j++) {
            int i = j - start;
            strings[i] = (j % 3 == 0 && j % 5 == 0) ? "FizzBuzz"
                    : (j % 3 == 0) ? "Fizz"
                    : (j % 5 == 0) ? "Buzz"
                    : String.valueOf(j);
        }
        return strings;

    }

    public static boolean catDog(String str) {
    int dog = 0;
    int cat = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")){
                cat++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }
        }
        System.out.println(dog + " " +  cat);
        return dog == cat;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e'){
                count++;
            }
        }
        return count;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
                return true;
            }
        }
        return false;
    }

    public boolean endOther(String a, String b) {
        if (a.toLowerCase().contentEquals(b.toLowerCase()) || b.toLowerCase().contentEquals(a.toLowerCase())){
            return true;
        }
        return false;
    }

    public boolean xyzThere(String str) {
        int len = str.length();
        int newLen = str.replaceAll("\\.xyz","").length();
        int newL = str.replaceAll("xyz","").length();

        if (len - newLen == 0){
            return false;
        }
        if (len - newL == 0){
            return false;
        }
        return ((len - newLen) > 0) ? false : true;
    }

    public boolean xyzMiddle(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("xyz")){
                int left = i - 1;
                int right = str.length() - (i + 2);
                if (Math.abs(left - right) < 1){
                    return true;
                }
            }
        }
        return false;
    }

    public String frontTimes(String str, int n) {
        String copy = (str.length() < 3) ? str.substring(0,str.length()) : str.substring(0,3);
        StringBuilder newSt = new StringBuilder();
        for (int i = 0; i < n; i++) {
            newSt.append(copy);
        }
        return newSt.toString();
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1) =="xx"){
                count++;
            }
        }
        return count;
    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;

        if (a != b && a != c) sum += a;
        if (b != a && b != c) sum += b;
        if (c != a && c != b) sum += c;

        return sum;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c == 13) return a + b;
        return a + b + c;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        if (num % 10 >= 5) {
            return num + (10 - num % 10);
        } else {
            return num - (num % 10);
        }
    }

    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        if (a > 21) return b;
        if (b > 21) return a;
        return Math.max(a,b);
    }

    public String oneTwo(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
                stringBuilder.append(str.charAt(i + 1));
                stringBuilder.append(str.charAt(i + 2));
                stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public String wordEnds(String str, String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length() - word.length(); i++) {
            if (str.substring(i, i + word.length()).equals(word)){
                if (i != 0) stringBuilder.append(str.charAt(i - 1));
                if (i + word.length() != str.length()) stringBuilder.append(str.charAt(i + word.length() + 1));
            }
        }
        return stringBuilder.toString();
    }

    public static String createPhoneNumber(int[] numbers) {
       StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) stringBuilder.append('(');
            if (i == 3) stringBuilder.append(") ");
            if (i == 6) stringBuilder.append('-');
            stringBuilder.append(numbers[i]);
        }
       return stringBuilder.toString();
    }



    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}

