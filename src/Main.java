import java.util.Arrays;

public class Main {
    public static void findCountElemAboveAvg(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]){
                    int sec = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = sec;
                }
            }
        }
    }

    public static double findSumAvgLines(int[][] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int dec : arr[i]) {
                sum += dec;
            }
        }
        return Math.round(sum/ arr.length * 10) / 10.0;
    }

    public static double findAvgOddElem(int[][] arr){
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int num : arr[i]) {
                if (num % 2 != 0){
                    count++;
                    sum += num;
                }
            }
        }

        if (count == 0){
            return 0;
        }
        return Math.round(sum/count * 10)/ 10.0;
    }

    public static int [] shiftValuesInArr(int[] arr, int shift) {
        for (int i = 0; i < shift; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0 ; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(shiftValuesInArr(new int[]{1,2,3,4,5},3)));
    }

    }

