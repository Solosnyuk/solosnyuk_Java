import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string,string.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String,String> map = new HashMap<>();
        for (String string : strings) {
            map.put(Character.toString(string.charAt(0)),
                    Character.toString(string.charAt(string.length())));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, map.getOrDefault(s,0) + 1);
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            map.put(Character.toString(string.charAt(0)),
                   map.getOrDefault(Character.toString(string.charAt(0)), "") + string);
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string,map.getOrDefault(string,0) + 1);

            if ((map.getOrDefault(string, 0) + 1) % 2 == 0) {
                result += (string);
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}

