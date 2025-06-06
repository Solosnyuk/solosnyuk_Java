public class CodeWars {
    public static int convertBits(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);

        int lenA = binA.length();
        int lenB = binB.length();
        int minLen = Math.min(lenA, lenB);
        int count = 0;

        for (int i = 1; i <= minLen; i++) {
            char bitA = binA.charAt(lenA - i);
            char bitB = binB.charAt(lenB - i);
            if (bitA != bitB) {
                count++;
            }
        }
        return count + Math.abs(lenA - lenB);
    }
}
