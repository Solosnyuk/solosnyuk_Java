import java.util.Arrays;

public class Main {
    public String stringBits(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i += 2   ) {
                string = string + str.charAt(i);
        }
        return string;
    }


    public static void main(String[] args) {

    }
}

