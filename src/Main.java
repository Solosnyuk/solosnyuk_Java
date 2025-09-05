import java.util.Arrays;

public class Main {
    public int[] copyEndy(int[] nums, int count) {
        int[] ints = new int[count];
        int coun = 0;

        for (int i = 0; coun < count; i++) {
            if (isEndy(nums[i])) {
                ints[coun] = nums[i];
                coun++;
            }
        }

        return ints;
    }

    boolean isEndy(int n){
        if (n >= 0 && n <=10 || n >= 90 && n <= 100){
            return true;
        }
        return false;
    }

    public String[] wordsWithout(String[] words, String target) {
        StringBuilder strings = new StringBuilder();
        for (String word : words) {
            if (!word.equals(target)){
                strings.append(word);
                strings.append(" ");
            }
        }
        return strings.toString().split(" ");
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end - 1 ; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end - 1 ; i++) {
            int plus = (heights[i] - heights[i + 1]);
            sum += (plus < 0) ? Math.abs(plus * 2) : plus;
        }
        return sum;
    }


    public static void main(String[] args) {

    }
}

