
public class Main {
    public String stringBits(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i += 2   ) {
                string = string + str.charAt(i);
        }
        return string;
    }

    public String stringSplosion(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            string = string + str.substring(0,i);
        }
        return string;
    }

    public int last2(String str) {
        if (str.length() == 1 || str.length() == 2 || str.isEmpty()){
            return 0;
        }

        int count = 0;
        String sub = str.substring(str.length() - 2,str.length());

        for (int i = 0; i < str.length() - 2; i++) {
            if (sub.equals(str.substring(i,i+2))){
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9){
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i <= 4; i++) {
            if (nums[i] == 9){
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
                return true;
            }
        }
        return false;
    }

    public static  int stringMatch(String a, String b) {
        int count = 0;
        int lengt = Math.min(a.length(), b.length());
        for (int i = 0; i < lengt - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))){
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {
        if (str.isEmpty() ){
            return "";
        }
        if (str.length() == 1){
            return str;
        }
        String string = str.charAt(0) + "";
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x'){
                string = string + str.charAt(i);
            }
        }
        string = string + str.charAt(str.length() - 1);
        return string;
    }

    public String altPairs(String str) {
        if (str.length() == 1){
            return str;
        }
        String string = "";
        for (int i = 0; i < str.length(); i += 4) {
            string = string + str.charAt(i);
            if ((i + 1) < str.length()) {
                string = string + str.charAt(i + 1);
            }
        }
        return string;
    }

    public String stringYak(String str) {
        String string = "";
        for (int i = 0; i < str.length() - 3; i++) {
            if (string.substring(i,i + 3).matches("y.k")){
                string = string + str.charAt(i);
            }
        }
        return string;
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6) || nums[i + 1] ==7){
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i+1] && nums[i] == nums[i + 2]){
                return true;
            }
        }
        return false;
    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;
        }
        return result;
    }

    boolean doubleX(String str) {
        int index = str.indexOf("x");
        if (index == -1){
            return false;
        }
        if (index != str.length());
        if (str.charAt(index + 1) == 'x'){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println(stringTimes("Af",3));
    }
}

