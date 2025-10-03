import java.math.BigInteger;
import java.util.*;

public class Main {
    public static String pigIt(String str) {
        String[] arrStr = str.split(" ");
        List<String> result = new ArrayList<>();

        for (String word : arrStr) {
            if (word.matches("\\p{Punct}")) {
                result.add(word);
            } else {
                String pigWord = word.substring(1) + word.charAt(0) + "ay";
                result.add(pigWord);
            }
        }
        return String.join(" ",result);
    }

    public static String rot13(String str) {
        String[] strings = str.split(" ");
        List<String> stringList = new ArrayList<>();

        for (String string : strings) {
            if (string.matches("\\p{Punct}") || string.matches("\\p{XDigit}")){
                stringList.add(string);
            }else{
                char[] characters = string.toCharArray();
                StringBuilder stringBuilder = new StringBuilder();

                for (char character : characters) {
                    stringBuilder.append(shiftLetter(character));
                }
                stringList.add(stringBuilder.toString());
            }
        }
        return String.join(" ",stringList);
    }

    public static char shiftLetter(char c) {
        if (Character.isUpperCase(c)) {
            return (char) ('A' + (c - 'A' + 13) % 26);
        } else if (Character.isLowerCase(c)) {
            return (char) ('a' + (c - 'a' + 13) % 26);
        } else {
            return c; // не буква — не меняем
        }
    }

    public static String incrementString(String str) {
        int index = -1;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                index = i;
                break;
            }
        }

        if (index == -1){
            return str + "1";
        }

        String word = str.substring(0,index);
        String digi = str.substring(index);

        return word + ivNull(digi);
    }

    public static String ivNull(String num) {
        int originalLength = num.length();
        BigInteger numericValue = new BigInteger(num).add(BigInteger.ONE);
        String incremented = numericValue.toString();

        int zerosToAdd = originalLength - incremented.length();
        if (zerosToAdd < 0) zerosToAdd = 0;

        return "0".repeat(zerosToAdd) + incremented;
    }


    public static void main(String[] args) {
        System.out.println(incrementString("foobar000"));

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

