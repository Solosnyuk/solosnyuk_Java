import java.util.*;

public class Main {
    public static  boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b'){
                return true;
            }
        }
        return false;
    }

    public static String mixString(String a, String b) {
        StringBuilder res=  new StringBuilder();
        for (int i = 0; i < (Math.max(a.length(), b.length()))-1 ; i++) {
            if (i <= a.length()-1){
                res.append(a.charAt(i));
            }
            if (i <= b.length()-1){
                res.append(b.charAt(i));
            }
        }
        return res.toString();
    }

    public static String repeatEnd(String str, int n) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        while (count != n){
            count++;
            res.append(str.substring(str.length() - n, str.length()));
        }
        return res.toString();
    }

    public static String repeatFront(String str, int n) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        while (count <= n){
            res.append(str.substring(0, n - count));
            count++;
        }
        return res.toString();
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < count; i++) {
            res.append(word);
            if (i < count - 1) {
                res.append(sep);
            }
        }

        return res.toString();
    }

    public static boolean prefixAgain(String str, int n) {
        String pref = str.substring(0,n);
        if (str.substring(n ).contains(pref)){
            return true;
        }
        return false;
    }

    public static boolean xyzMiddle(String str) {
        return str.substring().contains("xyz");
    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));

    }    }

