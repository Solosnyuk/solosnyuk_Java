import java.util.Arrays;

public class CodeWars {
    public static String[] dup(String[] arr){
        String[] res = new String[arr.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            char last = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (last != arr[i].charAt(j)) {
                    sb.append(last = arr[i].charAt(j));
                }
            }

            res[i] = sb.toString();
            sb.setLength(0);
        }
        return res;
        }

        return resArr;
    }
}
