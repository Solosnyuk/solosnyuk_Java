import java.util.*;

public class Main {
    public static String zipZap(String str) {
        return str.replaceAll("z[a-zA-Z]p","zp");
    }

    public static String starOut(String str) {
        return  str.replaceAll("[a-zA-Z]?\\*+[a-zA-Z]?", "");
    }

    public static String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int wordLen = word.length();
        while (i < str.length()) {
            int found = str.indexOf(word, i);
            if (found == i) {
                result.append(word);
                i += wordLen;
            } else {
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }

    public static int sum67(int[] nums) {
        boolean skip = false;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6){
                skip = true;
            }
            if (!skip){
                sum += nums[i];
            }
            if (nums[i] == 7){
                skip = false;
            }
        }
        return sum;
    }

    public static boolean has22(int[] nums) {
        int col = 0;
        for (int num : nums){
            if (col == num){
                return true;
            }
            if (num == 2){
                col = 2;
            }else {
                col = 0;
            }
        }
        return false;
    }

    public static boolean lucky13(int[] nums) {
        boolean res = true;
        for (int num : nums){
            if (num == 1 || num == 3){
                res = false;
            }
        }
        return res;
    }

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums){
            if (num == 2){
                sum += num;
            }
        }
        return sum == 8;
    }

    public static boolean more14(int[] nums) {
        int countOne = 0;
        int countFour = 0;
        for (int num : nums){
            if (num == 1){
                countOne++;
            } else if (num == 4) {
                countFour++;
            }
        }
        return countOne > countFour;
    }

    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int countYZ(String str) {
        int count = 0;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.replaceAll("[^a-zA-Z]", " ")
                .trim()
                .split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));
                if (lastChar == 'y' || lastChar == 'z') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countYZ("!day--yaz!!") );
    }
}

