import java.util.HashMap;

public class Main {
    public static void countWord(String str){
        String[] strArr = str.split("[\\p{Punct}\\s]+");
        HashMap<String, Integer> hMap = new HashMap<>();

        for (String word : strArr) {
                hMap.put(word,hMap.getOrDefault(word,0)+1);
        }
        System.out.println(hMap);
    }



    public static void main(String[] args) {
        String str = "Напишите программу на Java для подсчета количества" +
                " конкретных слов в строке, используя HashMap используя программу программу  ";

        countWord(str);
    }
}

