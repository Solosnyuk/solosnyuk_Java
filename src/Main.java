import java.util.*;

public class Main {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static int diff21(int n) {
        if (n <= 21){
            return 21 - n;
        }
        return (n - 21) * 2;
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking){
            if (hour > 20 || hour < 7){
                return true;
            }
        }
        return false;
    }

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0, out.length()/2) + word +out.substring( out.length()/2, out.length());
    }

    public static String extraEnd(String str) {
        String copy = str.substring(str.length() - 2, str.length());
        return copy + copy + copy;
    }

    public static String firstTwo(String str) {
        if (str.length() >= 2){
            return str.substring(0, 2);
        }
        return str;
    }

    public static String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr = newStr + str.charAt(i) + str.charAt(i);
        }
        return newStr;
    }

    public static int countHi(String str) {
        String search = "hi";
        int count = 0;
        for (int i = 0; i < str.length() - search.length() + 1; i++) {
            if (str.substring(i, i + 2).equals(search)){
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int countDog = 0;
        int countCat = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i,i + 3).equals("dog")){
                countDog++;
            }
            if (str.substring(i,i + 3).equals("cat")){
                countCat++;
            }
        }
        if (countDog == countCat){
            return true;
        }
        return false;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i,i + 2).equals("co") && str.charAt(i + 3) == 'e'){
                count++;
            }
        }
        return count;
    }

    public static boolean endOther(String a, String b) {
        if (a.toLowerCase().startsWith(b.toLowerCase(), a.length() - b.length())  ||
                b.toLowerCase().startsWith(a.toLowerCase(), b.length() - a.length())){
            return true;
        }
        return false;
    }

    public static boolean xyzThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")){
                if (i > 0 && str.charAt(i - 1) != '.'){
                    return true;
                }
                if (i == 0){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for(int num : nums){
            if (num % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums){
            if (num > max){
                max = num;
            }if (num < min){
                min = num;
            }
        }
        return  max - min;
    }

    public static int centeredAverage(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums){
            sum += num;
            if (num > max){
                max = num;
            }if (num < min){
                min = num;
            }
        }
        return (sum - min - max)/(nums.length - 2);
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13){
                sum += nums[i];
            }else {
                i++;
            }
        }
        return sum;
    }



    public static void main(String[] args) {
    }    }

