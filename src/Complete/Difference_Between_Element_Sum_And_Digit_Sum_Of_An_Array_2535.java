package Complete;

public class Difference_Between_Element_Sum_And_Digit_Sum_Of_An_Array_2535 {
    public static int differenceOfSum(int[] nums) {
        int totalSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            if (nums[i] > 9) {
                int number = nums[i];
                String s = String.valueOf(number);
                char[] chars = s.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    digitSum += Character.getNumericValue(chars[j]);
                }
            } else {
                digitSum += nums[i];
            }
        }
        return totalSum - digitSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3,};

        System.out.println(differenceOfSum(nums));
    }
}
