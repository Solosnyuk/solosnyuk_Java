import java.util.Arrays;

public class Main {
    public int[] makeLast(int[] nums) {
        int[] newArr = new int[nums.length + nums.length];
        newArr[newArr.length - 1] = nums[nums.length - 1];
        return newArr;
    }

    public boolean double23(int[] nums) {
        int countTwo = 0;
        int countThree = 0;
        for (int num : nums) {
            if (num == 2){
                countTwo++;
            }
            if (num == 3){
                countThree++;
            }
        }
        return (countThree == 2 || countTwo == 2)? true : false;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3){
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}

