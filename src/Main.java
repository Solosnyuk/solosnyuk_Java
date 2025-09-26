import java.util.Arrays;

public class Main {
    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1){
            count++;
        }
        if (b.length > 0 && b[0] == 1){
            count++;
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        return (Arrays.stream(a).sum() >= Arrays.stream(b).sum())? a : b;
    }

    public int[] makeMiddle(int[] nums) {
        int len = nums.length/2;
        return new int[]{nums[len - 1], nums[len]};
    }

    public int[] plusTwoStstem(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        System.arraycopy(a, 0, res, 0, a.length);
        System.arraycopy(b, 0, res, a.length, b.length);
        return res;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] newArr = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[i];
        }
        for (int i = a.length; i < a.length + b.length; i++) {
            newArr[i] = b[i - a.length];
        }
        return newArr;
    }

    public int[] swapEnds(int[] nums) {
        int dep = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = dep;
        return nums;
    }

    public static int[] midThree(int[] nums) {
        int indexSred = nums.length / 2;
        int[] newArr = new  int[3];
        newArr[0] = nums[indexSred - 1];
        newArr[1] = nums[indexSred];
        newArr[2] = nums[indexSred + 1];
        return newArr;
    }

    public int maxTriple(int[] nums) {
        if (nums.length== 3){
            return Arrays.stream(nums).max().getAsInt();
        }
        int indexSred = nums.length / 2;
        int max = 0;
        if (nums[0] > nums[nums.length  - 1]){
            max = nums[0];
        } else {
            max = nums[nums.length  - 1];
        }
        return (max > nums[indexSred])? max : nums[indexSred];
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 2){
            return nums;
        }
        int[] newArr = new int[2];
        newArr[0] = nums[0];
        newArr[1] = nums[1];
        return newArr;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length <= 1){
            return false;
        }
        if (nums.length == 2 && nums[0] == 1 && nums[1] == 3){
            return true;
        }
        for (int i = 0; i < 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3){
                return true;
            }
        }
        for (int i = nums.length - 3; i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3){
                return true;
            }
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] newArr = new int[2];
        if (a.length == 1 ){
            newArr[0] = a[0];
            newArr[1] = b[0];
            return newArr;
        }
        if (a.length >= 2){
            newArr[0] = a[0];
            newArr[1] = a[1];
            return newArr;
        }
        newArr[0] = b[0];
        newArr[1] = b[1];
        return  newArr;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            int[] newArr = new int[2];
            newArr[0] = a[0];
            newArr[1] = b[0];
            return newArr;
        }
        if (a.length == 0 && b.length > 0){
            return new int[]{b[0]};
        }
        if (b.length == 0 && a.length > 0){
            return new int[]{a[0]};
        }
        return new int[0];
    }

    public int[] maxEnd3(int[] nums) {

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(midThree(new int[]{1,2,3,4,5,6,7})));
    }
}

