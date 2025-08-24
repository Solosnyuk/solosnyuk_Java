import java.util.*;

public class Main {
    public static String getSandwich(String str) {
       if (str.replaceAll("bread","").length() == str.length()-10){
           return str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
       }else {
           return "";
       }
    }

    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                char leftChar = str.charAt(i - 1);
                char rightChar = str.charAt(i + 1);
                if (leftChar != rightChar) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(sameStarChar("*xa*a*"));

    }    }

