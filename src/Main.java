public class Main {
    public static void RedroverSchool (int a, int b) {
    for (int i = b; i <= a; i += 4) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int a = 60;
        int b = 40;
    RedroverSchool(a, b);
    }
}
