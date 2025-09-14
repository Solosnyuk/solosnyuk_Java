import java.util.Arrays;

public class Main {
    public static boolean dividesSelf(int n) {
        int digit;
        int orig = n;
        while (n > 0){
            digit = n % 10;
            n = n / 10;
            if (orig % digit != 0){
                return false;
            }
        }
        return true;
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty()){
                if (a[i].charAt(0) == b[i].charAt(0)){
                    count++;
                }
            }
        }
        return count;
    }

    public int scoresSpecial(int[] a, int[] b) {
        return Math.max(maxPoint(a),maxPoint(b));
    }

    public int maxPoint(int[] arr){
        int maxPoint = 0;
        for (int i : arr) {
            if (i % 10 == 0){
                maxPoint = Math.max(maxPoint, i);
            }
        }
        return maxPoint;
    }

    public static int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end ; i++) {
            if (5 <=(Math.max(heights[i], heights[i + 1]) - Math.min(heights[i], heights[i + 1]))){
               count++;
            }
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int sum = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].charAt(0) != '?'){
                if (key[i].charAt(0) == answers[i].charAt(0)){
                    sum += 4;
                }else{
                    sum -= 1;
                }
            }
        }
        return sum;
    }

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (Character.getNumericValue(a[i].charAt(0)) <=
                        Character.getNumericValue(b[i].length()) ) {
                    if (a[i].equals(b[i])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int i = 0, j = 0, index = 0;

        while (index < n) {
            // Если закончился массив a, берем из b
            if (i >= a.length) {
                result[index] = b[j];
                j++;
                index++;
                continue;
            }

            // Если закончился массив b, берем из a
            if (j >= b.length) {
                result[index] = a[i];
                i++;
                index++;
                continue;
            }

            // Сравниваем текущие элементы
            int compare = a[i].compareTo(b[j]);

            if (compare < 0) {
                // Элемент из a меньше
                result[index] = a[i];
                i++;
                index++;
            } else if (compare > 0) {
                // Элемент из b меньше
                result[index] = b[j];
                j++;
                index++;
            } else {
                // Элементы равны - добавляем один и пропускаем оба
                result[index] = a[i];
                i++;
                j++;
                index++;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2},0,1));
    }
}

