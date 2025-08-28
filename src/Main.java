import java.util.*;

public class Main {
    public static String[] fizzArray2(int n) {
        if (n == 0){
            return new String[0];
        }
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }

    public static boolean no14(int[] nums) {
        for (int num : nums) {
            if (num == 4){
                for (int i : nums) {
                    if (i == 1){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isEverywhere(int[] nums, int val) {
        if (nums.length == 0){
            return true;
        }

        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i] != val && nums[i + 1] != val){
                return false;
            }
        }
        return true;
    }

    public static boolean either24(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2){
                count++;
            }
            if (nums[i] == 4 && nums[i + 1] == 4){
                count++;
            }
        }
        if (count >= 2 ){
            return false;
        }
        return true;
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && (Math.abs(nums1[i] - nums2[i]) == 2 || Math.abs(nums1[i] - nums2[i]) == 1)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
    }
}

