import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Integer> bublSort(String stroka) {
        Map<String, Integer> result = new HashMap<>();

        String[] words = stroka
                .toLowerCase()
                .split(" ");

        for (String word : words) {
            result.merge(word, 1, (worldOld1, worldOld2) -> worldOld1 + worldOld2);
        }


        return result;
    }

    public static void main(String[] args) {
        String stroka = "Напишите напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap";
        System.out.println(bublSort(stroka));
    }
}
