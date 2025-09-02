import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static String wordAppend(String[] strings) {
        Map<String, Integer> count = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String word : strings) {
            count.put(word, count.getOrDefault(word, 0) + 1);
            if (count.get(word) % 2 == 0) {
                result.append(word);
            }
        }
        return result.toString();
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> count = new HashMap<>();
        Map<String, Boolean> countBoolean = new HashMap<>();

        for (String word : strings) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (String s : count.keySet()) {
            if (count.get(s) >= 2){
                countBoolean.put(s, true);
            }else{
                countBoolean.put(s, false);
            }
        }
        return countBoolean;
    }

    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(n -> !n.isEmpty())
                .filter(n -> !n.contains("yy"))
                .filter(n -> n.charAt(n.length() - 1) != 'y')
                .map(n -> n + "y")
                .collect(Collectors.toList());
    }

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .filter(n -> !String.valueOf(n).endsWith("2"))
                .collect(Collectors.toList());
    }

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n * n) + 10)
                .filter(n -> !String.valueOf(n).endsWith("6") ||
                                     !String.valueOf(n).endsWith("5"))
                .collect(Collectors.toList());
    }

    public List<String> no34(List<String> strings) {
        return strings.stream()
                .filter(n -> n.length() != 3 || n.length() !=4)
                .collect(Collectors.toList());
    }

    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean tripleUp(int[] nums) {
        if (nums.length < 3){
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == (nums[i + 1] - 1)){
                if (nums[i + 1] == (nums[i + 2] -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] fizzArray3(int start, int end) {
        int[] arr = new int[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            arr[index] = i;
            index++;
        }
        return arr;
    }

    public static int[] shiftLeft(int[] nums) {
        if (nums.length == 0){
            return nums;
        }
        int app = nums[0];
        for (int i = 0; i < nums.length -1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = app;
        return nums;
    }

    public static int[] tenRun(int[] nums) {
        int then = 0;
        boolean bol = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0){
                then = nums[i];
                bol = true;
            }
            if (bol){
                nums[i] = then;
            }
        }
        return nums;
    }

    public static int[] pre4(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4){
                index = i;
                break;
            }
        }
        return Arrays.copyOfRange(nums,0,index);
    }

    public static int[] post4(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4){
                index = i + 1;
            }
        }
        return Arrays.copyOfRange(nums,index,nums.length );
    }

    public String doubleChar(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
    }
}

