import java.math.BigInteger;
import java.util.*;

public class Main {
    public static String firstNonRepeatingLetter(String s){
        String[] charArr = s.split("");
        for (String string : charArr) {
            String revS = s.toLowerCase().replaceAll(string.toLowerCase(), "");
            if (s.length() == revS.length() + 1){
                return string;
            }
        }
        return "";
    }

    public static int sequence(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;

        for (int num : arr) {
            currentSum = Math.max(0, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        return recipe.entrySet().stream()
                .mapToInt(n -> available.getOrDefault(n,0)/recipe.get(n))
                .min()
                .orElse(0);
    }

    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        Map<String , List<Integer>> pos = new HashMap<>();

        return null;
    }

    public static String makeReadable(int seconds) {


        return Integer.toString(seconds);
    }
    
    public static void main(String[] args) {
        System.out.println(makeReadable(86399));
        List<Model> modelList = new ArrayList<>(
                Arrays.asList(
                        new Model(10),
                        new Model(15),
                        new Model(10),
                        new Model(2)
                )
        );

        Map<Model, Integer> countModel = new HashMap<>();

        for (Model model : modelList) {
            countModel.put(model,countModel.getOrDefault(model,0) + 1);
        }

        countModel.entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .forEach(n -> System.out.println(n.getKey()));
    }
}

