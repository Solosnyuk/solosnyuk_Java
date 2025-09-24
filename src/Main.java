import java.util.Arrays;

public class Main {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6){
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]){
            return true;
        }
        return false;
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]){
            return true;
        }
        return false;
    }

    public int sum3(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public static int[] rotateLeft3(int[] nums){
        if (nums.length == 0) return nums;

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            result[i] = nums[i + 1];
        }
        result[nums.length - 1] = nums[0];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft3(new int[]{1,2,3,4})));
    }
}

