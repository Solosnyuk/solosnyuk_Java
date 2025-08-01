import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static String whoLikesIt(String... names) {
        List<String> listName = Arrays.stream(names).collect(Collectors.toList());

        if (listName.size() == 0){
            return "no one likes this";
        }else if (listName.size() == 1){
            return listName.get(0) +" likes this";
        } else if (listName.size() == 2) {
            return listName.get(0) + " and " + listName.get(1) + " likes this";
        } else if (listName.size() == 3) {
            return listName.get(0) + ", " + listName.get(1) + " and " + listName.get(2) + " likes this";
        } else if (listName.size() >= 4) {
            return listName.get(0) + ", " + listName.get(1) + " and "
                    + (listName.size() - 2) + " others like this";
        }
        return "";
    }

    public static int findIt(int[] a) {
        HashMap<Integer, Integer> mapIt = new HashMap<>();
        for (int it : a) {
            mapIt.merge(it,1,Integer::sum);
        }
        for (Map.Entry<Integer,Integer> hash : mapIt.entrySet()) {
            if (hash.getValue() % 2 != 0) {
                return hash.getKey();
            }
        }
        return 0;
    }

    public static  int solution(int number) {
        int sum = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0) {
                sum += i;
            } else if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static String[] towerBuilder(int nFloors) {
        String[] towerBuild = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            StringBuilder inter = new StringBuilder();
            StringBuilder startStr = new StringBuilder();

            for (int j = 0; j < i + 1 ; j++) {
                inter.append("*");

            }
            for (int j = 0; j < nFloors - i - 1; j++) {
                startStr.append(" ");
            }
            String nulle = String.valueOf(startStr);
            String medi = String.valueOf(inter);

            towerBuild[i] = nulle + medi + nulle;
        }
        return towerBuild;
    }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(towerBuilder(6)));

        }
    }

