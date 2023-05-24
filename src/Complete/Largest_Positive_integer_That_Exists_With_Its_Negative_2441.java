package Complete;

public class Largest_Positive_integer_That_Exists_With_Its_Negative_2441 {
    public static int findMaxK(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 0) {
                    if (nums[i] >= 1) {
                        if (nums[i] > max) {
                            max = nums[i];
                        }
                    } else {
                        if (nums[j] > max) {
                            max = nums[j];
                        }
                    }
                }
            }
        }
        if (max != 0) {
            return max;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-37, 37, -9, 2, 47, 18, 13, -11, 9, -28};

        System.out.println(findMaxK(arr));
    }
}
