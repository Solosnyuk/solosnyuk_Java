public class Main {
    public static int maxBlock(String str) {
        if (str.isEmpty()) return 0;

        int max = 0;
        int count = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)){
                count++;
                if (count > max){
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max + 1;
    }

    public static String sameEnds(String string) {
        String sub = "";
        for (int i = 0; i <= string.length() / 2 ; i++) {
            if (string.substring(0, i).equals(string.substring(string.length() - i))){
                sub = string.substring(0, i);
            }
        }
        return sub;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int max = (Math.max(a, c) < b) ? b : Math.max(a,c);
        int min = (Math.min(a, c) < b) ?  Math.min(a,c) : b;
        int sred = (a + b + c) - (max + min);
        if ((max - sred) == (sred - min)){
            return true;
        }
        return false;
    }

    public int maxSpan(int[] nums) {
        return nums.length - 1;

    }

    public static void main(String[] args) {
        System.out.println(evenlySpaced(9, 10, 11));
    }
}

