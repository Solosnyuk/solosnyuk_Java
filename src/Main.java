import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.IntStream.iterate;

public class Main {
    public static String removeBang(String str) {
        if (str.isEmpty()){
            return "";
        }
        String[] arr = str.split(" ");
        StringBuilder newStr = new StringBuilder();
        for (String hi : arr) {
            while (hi.charAt(hi.length() -1) == '!') {
                    hi = hi.substring(0, hi.length() - 1);
                }
            newStr.append(hi).append(" ");
            }
        return newStr.toString().trim();
    }

    public static int findNthOccurrence(String subStr, String str, int occurrence) {
        int count = 0;
        for (int i = 0; i < subStr.length() - str.length(); i++) {
            if (subStr.startsWith(str,i)){
                count++;
                if (count == occurrence){
                    return i;
                }
                i += str.length();
            }
        }
        if (count < occurrence){
            return -1;
        }
        return -1;
    }

        public static void main(String[] args) {
            System.out.println(findNthOccurrence("Test1 Test2 Test3 Test4","Test",1));
    }
}
