import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        if(arr[0]==arr[1])
            return arr[arr.length-1];
        else
            return arr[0];
    }

    public static boolean isNarcissistic(int number) {
        int summ = 0;
        int num = number;
        while (num > 0){
            int dig = num % 10;
            num = num / 10;
            summ += Math.pow(dig, Integer.toString(number).length());
        }
        System.out.println(summ);
        if (summ == number){
            return true;
        }
        return false;
    }

    public static int uniqueValues(int[] arr){
        Set<Integer> arSet = new HashSet<>();
        for (int num : arr) {
            arSet.add(num);
        }
        return arSet.size();
    }

    public static int findSameInLine(int[] arr) {
        if (arr.length == 0) return 0;

        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 1;
            }
        }
        return maxCount;
    }

    public static int [] delElementFromArr(int[]arr, int index){
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i > index) {
                newArr[i - 1] = arr[i];
            }
        }
        return newArr;
    }

    public static void switchMinMax(int [] arr){
        int indexMin = 0;
        int indexMax = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        arr[indexMin] = max;
        arr[indexMax] = min;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        switchMinMax(new int[]{1,2,3,4,5});
        }
    }

