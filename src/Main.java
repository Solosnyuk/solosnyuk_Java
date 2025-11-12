import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
    public static Map<String, Integer> countMap(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s,0) +1);
        }
        return map;
    }
}