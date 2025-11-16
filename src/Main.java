import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < 5_000; i++) {
            listInt.add(0,i);
        }
        System.out.println(System.currentTimeMillis() - start);

        LinkedList<Integer> linkInt = new LinkedList<>();
        long statrLink = System.currentTimeMillis();

        for (int i = 0; i < 5_000; i++) {
            linkInt.addFirst(i);
        }
        System.out.println(System.currentTimeMillis() - statrLink);
    }

    public static void benchmark(List list) {
        Date curencyTime = new Date();
        addList(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - curencyTime.getTime();
        System.out.println("Результат в мс " + msDelay);
    }

    public static void addList(List list) {
        for (int i = 0; i < 1_000_000_000; i++) {
            list.add(i);
        }
    }

}