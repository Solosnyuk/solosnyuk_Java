import java.util.*;

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

    public int maxSpan(int[] nums) {
        int span = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)){
                map.put(num,i);
            }
            int sp = i - map.get(num) + 1;
            span = Math.max(span, sp);
        }
        return span;
    }

    public int[] fix34(int[] nums) {
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && (nums[i - 1] != 3 || nums[i] == 0)){
                indexList.add(i);
            }
        }

        int indexFour = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4){
                int dep = nums[i + 1];
                int swap = indexList.get(indexFour++);
                nums[swap] = dep;
                nums[i + 1] = 4;
            }
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5){
                indexList.add(i);
            }
        }

        int indexFive = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5){
                int dep = nums[i + 1];
                int swap = indexList.get(indexFive++);
                nums[swap] = dep;
                nums[i + 1] = 5;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
    }
}

