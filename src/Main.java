import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static String alphabetWar(String fight){
        int countLeft = 0;
        int countRight = 0;

        for (int i = 0; i < fight.length(); i++) {
            switch (fight.charAt(i)){
                case 'w':
                    countLeft += 4; break;
                case 'p':
                    countLeft += 3; break;
                case 'b':
                    countLeft += 2; break;
                case 's':
                    countLeft += 1; break;
                case 'm':
                    countRight += 4; break;
                case 'q':
                    countRight += 3; break;
                case 'd':
                    countRight += 2; break;
                case 'z':
                    countRight += 1; break;
            }
        }
        if (countLeft > countRight) {
            return "Let's fight again!";
        } else if (countLeft < countRight) {
            return "Right side wins!";
        }
        return "Let's fight again!";
    }

    public static void main(String[] args) {
        String stringAf = "wwwwwwz";
        int value = 6;
        System.out.println(alphabetWar(stringAf));
    }
}