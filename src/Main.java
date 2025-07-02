import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void bublSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - 1 - i; j++){
                if (sortArr[j] > sortArr[j + 1]) {
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sortArr));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(elements)
                .filter(element -> map.merge(element,1,Integer::sum) <= maxOccurrences)
                .toArray();

    }

    public static void main(String[] args) {
        int[] arr = { 20, 37, 20, 21 };
        System.out.println(deleteNth(arr,1));
    }
}
