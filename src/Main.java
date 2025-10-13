import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }

    public String maxValue(Map<String, Integer> map) {
        int max = 0;
        String keyMax = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                keyMax = entry.getKey();
            }
        }
        return keyMax;
    }

    public Map<String, Integer> deletNull(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                map.remove(entry.getKey());
            }
        }
        return map;
    }

    public Integer sumAllValue(Map<String, Integer> map) {
        Integer summ = 0;

        for (Integer integer : map.values()) {
            summ += integer;
        }
        return summ;
    }

    public List<String> searchAllKeyB(Map<String, Integer> map) {
        List<String> list = new ArrayList<>();
        for (String string : map.keySet()) {
            if (string.startsWith("B")) {
                list.add(string);
            }
        }
        return list;
    }

    public Map<String, Integer> addFive(Map<String, Integer> map) {
        for (Integer value : map.values()) {
            value = value + 5;
        }
        return map;
    }
}