import java.util.Arrays;

public class Main {
    public static int[] seriesUp(int n) {
        int[] intArr = new int[n*(n + 1)/2];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                intArr[index++] = j;
            }
        }
        return intArr;
    }

    public static int maxMirror(int[] nums) {
        int maxCount = 0;
        int count = 0;
        int indexLeft = 0;
        int indexRight = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - j; j++) {
                if (nums[i + indexLeft++] == nums[j - indexRight++]){
                    count++;
                    if (count > maxCount){
                        maxCount = count;
                    }
                }else{
                    indexLeft = 0;
                    indexRight = 0;
                }
            }
        }
        return maxCount;
    }


    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
    }
}

