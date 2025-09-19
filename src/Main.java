import java.util.Arrays;

public class Main {
    public static String solve(final String str) {
        int countLow = 0;
        int countUp = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                countUp++;
            }else{
                countLow++;
            }
        }
        return (countLow >= countUp)? str.toLowerCase() : str.toUpperCase();
    }

    public static int[] minMax(int[] arr) {
        int[] arrMinMax = new int[2];
        arrMinMax[0] = Arrays.stream(arr).min().getAsInt();
        arrMinMax[1] = Arrays.stream(arr).max().orElse(1);
        return arrMinMax;
    }

    public static int twiceAsOld(int dadYears, int sonYears) {
        //TODO: Add code here
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1,2,3,4})));
    }
}

