import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");

        Iterator<String> iterator = strings.iterator();
        int key = 0;
        while (iterator.hasNext()){
            iterator.next();
                if (key % 2 == 1){
                    iterator.remove();
                }
            key ++;
        }
        System.out.println(strings);


    }
}

