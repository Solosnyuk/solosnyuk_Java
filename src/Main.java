import java.util.ArrayList;

public class Main {
        public static int countPassengers(ArrayList<int[]> list) {
            return list.stream()
                    .mapToInt(x -> x[0] - x[1]).sum();
        }

        public static String printerError(String s) {
            return s.chars()
                    .filter(n -> n > 'm')
                    .count() + "/" + s.length();
        }

        public static void main(String[] args) {
            System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
        }
    }

