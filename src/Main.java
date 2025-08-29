import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7){
                return true;
            } else if (nums[i] == 7 && nums[i + 2] == 7) {
                return true;
            } else if (nums[i + 1] == 7 && nums[i + 2] == 7) {
                return true;
            }
        }
        return false;
    }

    public static boolean has12(int[] nums) {
        int indexONe = 0;
        int indexTwo = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 1){
                indexONe = i;
            } else if (nums[i] == 2) {
                indexTwo = i;
            }
        }
        if (indexONe < indexTwo){
            return true;
        }
        return false;
    }

    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0 ){
                return true;
            } else if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 3){
                count++;

            if (i < nums.length - 1 && nums[i + 1] == 3 ) {
                return false;
            }}
        }
        if (count == 3){
            return true;
        }
        return false;
    }

    public static String withoutString(String base, String remove) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < base.length() ; i++) {
            if (base.substring(i, i + remove.length()).equalsIgnoreCase(remove) ){
                newStr.append("");
                i += remove.length() - 1;
            }else{
                newStr.append(base.charAt(i));
            }
        }
        return newStr.toString();
    }

    static int[] sortedBubl(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args){

        List<Integer> numbers = new LinkedList<>();

        // 2. Добавьте числа от 1 до 10
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // 3. Удалите все четные числа
        numbers.removeIf(n -> n % 2 == 0);

        // 4. Найдите сумму всех элементов списка
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        // 5. Найдите максимальное число в списке
        Collections.max(numbers);

        // 6. Переверните список (первый элемент становится последним и т.д.)
        Collections.reverse(numbers);

        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elderberry");
        words.add("fig");
        words.add("grape");

        // 1. Найдите все слова, которые начинаются на букву 'a'
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            String word = iterator.next(); // Получаем actual элемент!
            if (word.toLowerCase().charAt(0) == 'a') { // Игнорируем регистр
                System.out.println(word);
            }
        }

        // 2. Найдите самое длинное слово в списке
        words.stream().max(Comparator.comparingInt(String::length));

        // 3. Создайте новый список только с словами длиной более 5 символов
        List<String> newArr = words.stream()
                .filter(w -> w.length() > 5)
                .collect(Collectors.toList());

        // 4. Удалите все слова, содержащие букву 'e'
        words.removeIf(word -> word.toLowerCase().contains("e"));

        // 5. Преобразуйте все слова в верхний регистр
        words.stream()
                .map(w -> w.toUpperCase())
                .collect(Collectors.toList());


        String text = "hello world java programming hello java world";

        // 1. Создайте мапу для подсчета частоты слов
        Map<String, Integer> wordCount = new HashMap<>();

        // 2. Разделите текст на слова и подсчитайте частоту каждого слова
        String[] wordsString = text.split(" ");
        for (String word : wordsString) {
            wordCount.put(word, wordCount.getOrDefault(word,0) + 1);
        }

        // 3. Найдите самое частое слово
        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        // 4. Выведите все слова, которые встречаются более 1 раза
        for (Map.Entry<String,Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1){
                System.out.println(entry);
            }
        }



    }
}

