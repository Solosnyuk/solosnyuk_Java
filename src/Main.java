import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void bublSort(ArrayList stroka) {
        for (int i = 0; i < stroka.size(); i++) {
            System.out.println(stroka.get(i));
        }
    }

    public static void whileArrays (ArrayList stroka) {
        int i = 0;
        while (i < stroka.size()) {
            System.out.println(stroka.get(i));
            i++;
        }
    }

    public static <T> void  forEachArrays (ArrayList<T> stroka) {
        for (T element : stroka) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        listNum.add(2);
        listNum.add(5);
        listNum.add(9);

        ArrayList<String> listString = new ArrayList<>(List.of("sss", "bbb", "ffff"));

        forEachArrays(listString);
    }
}
