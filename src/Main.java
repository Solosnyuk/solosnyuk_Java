import java.util.Arrays;
import java.util.stream.Stream;

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

    public String[] mergeTwo(String[] a, String[] b, int n) {
        return Stream.concat(Arrays.stream(a),Arrays.stream(b))
                .distinct()
                .sorted()
                .limit(3)
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1,2,3,4})));
    }
}

