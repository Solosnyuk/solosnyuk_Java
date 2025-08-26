import java.util.*;

public class Main {
//1, 2, 3, 4, 4, 5, 6, 7, 7, 7 4
    public static void searchNum(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Число " + entry.getKey() + " количество раз: " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7, 7, 7, 4};
        searchNum(arr);

        String st = "qq  ss jh kk a aff   jg";

        String[] arrNew = st.split(" ss ");
        System.out.println(arrNew[0].toUpperCase() + " " + arrNew[1].toLowerCase());

        System.out.println(st.replaceAll(" ", "").substring(0,10));
    }
}

