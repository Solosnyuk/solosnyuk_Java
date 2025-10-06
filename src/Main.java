import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public String spinWords(String sentence) {
        String[] strings = sentence.split(" ");
        List<String> stringList = new ArrayList<>();

        for (String string : strings) {
            if (string.length() >= 5){
                stringList.add(new StringBuilder(string).reverse().toString());
            }else {
            stringList.add(string);
            }
        }
        return String.join(" ", stringList);
    }

    public static int countBits(int n){
        int sum = 0;
        String binaryN = Integer.toBinaryString(n);
        for (int i = 0; i < binaryN.length(); i++) {
            if(binaryN.charAt(i) == '1'){
                sum++;
            }
        }
        return sum;
    }

    static String encode(String word){
        String wordUp = word.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < wordUp.length(); i++) {
            char ch = wordUp.charAt(i);
            boolean isUnique = wordUp.indexOf(ch) == wordUp.lastIndexOf(ch);
            stringBuilder.append(isUnique ? "(" : ")");
        }
        return stringBuilder.toString();
    }

    static int find(int[] integers) {
        int sumEven = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0){
                sumEven++;
            }
        }
        boolean evenKey = (sumEven >= 2)? true : false;
        for (int integer : integers) {
            if(evenKey){
                if (integer % 2 != 0){
                    return integer;

                }
            }else{
                if (integer % 2 == 0){
                    return integer;
                }
            }
        }
        return 0;
    }

    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> integerMapStrOne = new HashMap<>();
        Map<Character, Integer> integerMapStrTwo = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            Character ch = str1.charAt(i);
            integerMapStrOne.put(ch,integerMapStrOne.getOrDefault(ch,0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            Character ch = str2.charAt(i);
            integerMapStrTwo.put(ch,integerMapStrTwo.getOrDefault(ch,0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : integerMapStrTwo.entrySet()) {
            if (integerMapStrOne.get(entry.getKey()) == null ||
                    entry.getValue() > integerMapStrOne.get(entry.getKey())){
                return false;
            }
        }
        return true;
    }

    public static long ipsBetween(String start, String end) {
        return -1;
    }

    static String toCamelCase(String s){
        String[] strings = s.split("[ -]");
        return Arrays.stream(strings)
                .skip(1)
                .map(w -> w.substring(0,1).toUpperCase() + w.substring(1))
                .reduce(strings[0], String::concat);
    }

    public static void main(String[] args) {
        System.out.println(scramble("ab", "zyxcba"));


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

