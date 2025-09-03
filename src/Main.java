import java.util.Arrays;
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


    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
    }
}

