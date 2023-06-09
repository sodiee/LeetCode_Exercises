package Complete;

import java.util.Arrays;

public class Two_Sum_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {3,3};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
}
