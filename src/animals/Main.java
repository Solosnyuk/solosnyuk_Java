package animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animals cow = new Cow("Корова");
        Animals beer = new Beer("Медведь");
        Animals leon = new Leon("ЛЕв");
        Animals wolf = new Wolf("Волк");
        Animals banny = new Banny("Кролик");

        List<Animals> animalsList = new ArrayList<>(
                Arrays.asList(cow,banny,leon,wolf,beer)
        );

        for (Animals animals : animalsList) {
        }


    }
}
