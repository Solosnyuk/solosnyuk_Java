public class Main {
    public static void main(String[] args) {
        Instrument gibson = new Guitar("Gibson");
        Instrument piano = new Piano("Беларусь");

        gibson.tune();
        gibson.play();
        piano.tune();
        piano.play();
    }
}