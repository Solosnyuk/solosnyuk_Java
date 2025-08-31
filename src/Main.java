import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("yogurt",map.get("ice cream"));
        }
        if (map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }
        return map;
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")){
            map.put("fries",map.get("potato"));
        }
        if (map.containsKey("salad")){
            map.put("spinach",map.get("salad"));
        }
        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() != map.get("b").length()) {
                if (map.get("a").length() > map.get("b").length()) {
                    map.put("c", map.get("a"));
                } else {
                    map.put("c", map.get("b"));
                }
                return map;
            }
            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
                return map;
            }
        }
        return map;
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string,0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string,string.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            map.put(Character.toString(string.charAt(0)), Character.toString(string.charAt(string.length())));
        }
        return map;
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings){
            map.put(Character.toString(string.charAt(0)) ,
                    map.getOrDefault(Character.toString(string.charAt(0)), "") + string);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(wordCount(new String[]{"a", "b", "a", "c", "b"}));
    }
}

