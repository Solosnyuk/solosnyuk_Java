import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100){
                 if (scores[i] == scores[1 + i]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 1; i < scores.length - 1; i++) {
            if (scores[i + 1] - scores[i] <= 2){
                if (scores[i] - scores[i - 1] <= 2){
                    if (scores[i + 1] - scores[i - 1] <= 2){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        return Math.max(average(scores,0,scores.length/2),
                average(scores,scores.length/2,scores.length));
    }

    int average(int[] scores, int start, int end) {
        int[] firstHalf = Arrays.copyOfRange(scores,start,end);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < firstHalf.length; i++) {
            sum += firstHalf[i];
            count ++;
        }
        return  sum/count;
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len){
                count++;
            }
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        return Arrays.copyOfRange(words,0, n);
    }

    public List wordsWithoutList(String[] words, int len) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len){
                strings.add(words[i]);
            }
        }
        return strings;
    }

    public boolean hasOne(int n) {
        int digit;
        while (n > 0){
            digit = n % 10;
            n = n / 10;
            if (digit == 1){
                return true;
            }
        }
        return false;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] ints = new int[count];
        int counst = 0;
        for (int i = 0; counst < count; i++) {
            if (nums[i] % 2 == 0){
                ints[counst] = nums[i];
                counst++;
            }
        }
        return ints;
    }

    public static void main(String[] args) {

    }
}

