import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1").trim();
    }

    public static void main(String[] args) {
        int num = 53421;
        String str = "camelCasing";
        System.out.println(camelCase(str));
    }
}
