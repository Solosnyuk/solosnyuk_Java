public class CodeWars {
    public static String capitalize(String s, int[] ind){
        StringBuilder sStrBuilder = new StringBuilder(s);
        for (int num : ind){
            if (num < s.length()) {
                sStrBuilder.setCharAt(num, s.toUpperCase().charAt(num));
            }
        }
        return sStrBuilder.toString();
    }
}
