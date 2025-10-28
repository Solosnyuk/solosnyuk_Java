import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
// заполняем 10_000_000 элементов
        removeAllRecursive(list, 0);
    }

    public static void removeAllRecursive(ArrayList<Integer> list, int index) {
        if (index >= list.size()) return;

        list.remove(index);              // удаляем элемент
        removeAllRecursive(list, index); // рекурсивный вызов с ТЕМ ЖЕ индексом
    }

}